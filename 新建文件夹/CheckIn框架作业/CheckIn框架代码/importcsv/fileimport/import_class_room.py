# coding=utf-8

from base_import import BaseImport
from importcsv.checker.base_check import BaseCheckMixin


class ImportClassRoomInfo(BaseImport, BaseCheckMixin):
    columns = ['RoomID','SeatNumber', 'ExamSeatNumber']
    keys = ['RoomID']
    validator_re = {"RoomID": '^[\d]{4,5}$',
                     "RoomScale": r'^[0-9]',
                     "Volume": '^[0-9_]+$',
                    "Damage1":'[0-9]+$',
                    "Damage2": '[0-9]+$',
                    "Damage3": '[0-9]+$',
                    "Damage4": '[0-9]+$',
                    "Damage5": '[0-9]+$',
                    }
    def arrange(self):
        seatNumber = int(i['Volume']) - int(i['Damage1']) - int(i['Damage2']) - int(i['Damage3']) - int(
            i['Damage4']) - int(i['Damage5'])
        if i['RoomScale'] == '3列':
            ExamSeatNumber = 2 * 30 - int(i['Damage1']) - int(i['Damage3'])
        else:
            ExamSeatNumber = 3 * 30 - int(i['Damage1']) - int(i['Damage3']) - int(i['Damage5'])
        return {'RoomID': i['RoomID'], 'SeatNumber': seatNumber, 'ExamSeatNumber': ExamSeatNumber}

    def file_import(self, file_name, _filename):
        if not (self.filename_check(file_name) and self.filename_check(_filename)):
            print '文件格式错误'
            return

        date = self.read_file(file_name)
        original_data = self.read_file(_filename)
        wrong_log = {}
        #去重
        date = self.remove_repeat(date, original_data)
        # 检查内部的重复数据
        self.dup_key_check(date, wrong_log)
        self.check_column_data(date, wrong_log)
        if wrong_log:
            print '教室信息有误！' + str(wrong_log)
            return

        class_date = []
        for i in date:
            if not self.volume_check(i):
                continue
            if not self.damage_check(i):
                continue
            class_date.append(self.arrange(i))

        self.write_file(class_date,_filename)


if __name__ == '__main__':

    # 待导入教室信息文件
    new_file = '../../OutData/classRoomInfo.csv'
    # 目标文件
    orig_file = '../../InData/classRoomInfo.csv'
    # 实例化
    roomInfo = ImportClassRoomInfo()
    # 调用方法
    roomInfo.file_import(new_file, orig_file)