# encoding=utf-8

from tccommonmethod import Method
from __init__ import readini
from TimeWindow import Timer
import csv
import time
import os


# This program is show teacher to start the checkIn
class teastartcheckin(Method):
 #对教师开始考勤类进行初始化
    def __init__(self):
        Method.__init__(self)
        pass

    # 教师进入列表。
    def entryList(self,TeacherID,CourseID):
        pass
        #建立一个Timer计时器的实例
        #将教师对应的课程的所有班级记录在list里
        #判断要进入考勤列表的班级是否与已经进入考勤列表的班级有交集 有的话 是否将其从列表中踢掉 没有直接进入考勤列表

    # 生成考勤次序表+考勤详细表
    def creatSeq(self,TeacherID, CourseID):
        pass

    # 生成sum表，在考勤时间窗口结束后汇总信息
    def creatSum(self,TeacherID, CourseID):
        pass

    #教师开始考勤
    def startCheckIn(self,teacherWechatID,CourseID):
        CourseID = CourseID
        TeacherID = self.checkTeacherID(teacherWechatID)
        if (self.entryList(TeacherID,CourseID) != False):
            self.creatSeq(TeacherID,CourseID)
            self.creatSum(TeacherID,CourseID)