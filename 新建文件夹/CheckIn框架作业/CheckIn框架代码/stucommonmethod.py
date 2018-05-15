# encoding=utf-8

import csv
from __init__ import readini
# This is the program show the common-methods for student

class stuMethod():

    #对普适方法进行初始化
    def __init__(self):
        pass

    #返回值：[stuID,stu-class]
    def checkStudent(self,_stuWechatID):
        pass



    #通过微信号找到要考勤的班级detail文件名 返回值类型：字符串
    def checkFileName(self,_stuWechatID):
        pass
        # 设置查询班级时的控制变量
        # 在考勤列表中找到学生的班级
        # 在seq表里找到该考勤的文件，读取seqid
