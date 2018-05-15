# encoding=utf-8

from tccommonmethod import Method
import os
import csv


class view(Method):
    #查看考勤信息

    def __init__(self):
        Method.__init__(self)
        pass


    def showRealTime(self,teacherWechatID):
        #打开detail文件，显示考勤基本情况
        pass

    def sumCheckIn(self,teacherWechatID,CourseID):
        #打开sum文件 显示考勤基本情况（此处sum文件内容没有更新 仍是初始化的信息）
        pass