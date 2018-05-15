# encoding=utf-8

# This program show the student's operations

from stucommonmethod import stuMethod
import csv
import time
import random

class stuCheckIn(stuMethod):

    #对学生正常考勤类进行初始化
    def __init__(self):
        stuMethod.__init__(self)
        pass

    #学生进行正常的自主考勤
    def stuAutoCheckIn(self,_stuWechatID,inputStream):
        pass
        #找到考勤刚生成的detail表文件名
        #匹配判断结果设为随机数 状态设置为空
        #判断考勤窗口是否结束
        #写入考勤信息
