#encoding=utf-8

from tccommonmethod import Method
from stucommonmethod import stuMethod
from __init__ import readini
import csv
import random



class teacherRandomCheckIn(Method):
    #对教师抽点类的初始化
    def __init__(self):
        Method.__init__(self)
        pass

    #教师开始抽点
    def randomCheckIn(self,teacherWechatID,num):
        pass

    # 学生进行抽点  参数学生微信号 对于没有被考勤的学生 系统不响应考勤请求
    def stuRandomCheckIn(self,_stuWechatID,inputStream):
        pass


#此时含有教师开启抽点和学生进行抽点的函数
if __name__ == "__main__":
    pass