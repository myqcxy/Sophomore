#encoding=utf-8

from tccommonmethod import Method
import csv
import time


class teacherManualCheckIn(Method):
    #对教师手工考勤类的初始化
    def __init__(self):
        Method.__init__(self)
        pass

    #教师进行手工考勤修改
    def manualCheckInAlter(self,teacherWechatID):
        #打开对应的detail文件
        #输入学生的id和学生的考勤结果，修改后记录到文件里面
        pass

    #教师进行手工考勤增加
    def manualCheckInAdd(self,teacherWechatID):
        pass

    #教师进行手工确认请假
    def leaveCheckIn(self,teacherWechatID):
        pass

