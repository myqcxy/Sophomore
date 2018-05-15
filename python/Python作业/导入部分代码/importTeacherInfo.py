# -*- coding: utf-8 -*-


import csv
#import csvkit
import os
import  CheckInfo
#检查重复信息
def getUniqueLine(_file, line):
    csvfile = open(_file, 'rb')
    reader = csv.reader(csvfile)
    reader.next()
    for line1 in reader :
        if line1[0] == line.split(',')[0] :
            return False

    csvfile.close()
    return True

#导入教师信息
def importTeacherInfo(_file):
    #正确表头
    message0 =["TeacherID", "TeacherName", "WeChatID"]
    if not CheckInfo.check (_file, message0 ) :
        return

    filename = 'F:\learn\python\Python作业\test\test.csv'
    csvfile1 = open(filename, 'r+')
    lines = csvfile1.readlines()
    csvfile1.seek(0)
    for line in lines :
        if getUniqueLine(_file, line) :
            csvfile1.write(line)

    #对文件进行更新
    csvfile1.truncate()
    csvfile1.close()

    #存入待导入信息
    Date = []
    reader = csv.reader(file(_file, 'rb'))
    reader.next()
    for line in reader :
        Date.append(line)

    #导入正确信息
    csvfile = open(filename, 'a')
    writer = csv.writer(csvfile)
    writer.writerows(Date)
    csvfile.close()
    print '导入成功'

if  __name__ == '__main__' :
    #待导入教师信息
    filename ='F:/learn/python/Python作业/.CSV文件/teacherInfo.csv'
    #导入教师信息
    importTeacherInfo(filename)



