# encoding=utf-8

from stucommonmethod import stuMethod
import csv
import time

class stuDelay(stuMethod):

    #对学生请假类的初始化
    def __init__(self):
        stuMethod.__init__(self)
        pass


    #学生进行请假，与自助考勤不同的是结果记录为假条提交
    def stuLeave(self,_stuWechatID,inputStream):
        pass
