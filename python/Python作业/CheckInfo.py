# -*- coding: utf-8 -*-
import csv
def check (_filename, message0) :
    csvfile = open(_filename, 'rb')
    reader = csv.reader(csvfile)
    #获取文件第一行
    message = reader.next()
    #存放错误行
    Dict = {}
    #表头信息完整
    if message == message0:
        #获取行数
        count = 2
        for line in reader:
            if len(line) == len(message0):
                if line.count('') == 0:
                    pass
                else:
                    Dict.update({count: '某项信息为空'})
            else:
                Dict.update({count: '对象信息数量不匹配'})
            #读取下一行
            count = count + 1

        if len(Dict) == 0:
            csvfile.close()
            return True

        else:
            csvfile.close()
            for key, value in Dict.items():
                print "Error:",key, value
            return False
    #表头信息不完整
    else:
        csvfile.close()
        print "表头信息不完整或有错误"
        return False
