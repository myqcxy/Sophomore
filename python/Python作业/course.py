import CheckInfo
import csv
#????????????
def sortStu():
    #??????????r????
    class1_file = open('F:\\learn\\python\\Python???\\.CSV???\\???1401.csv')
    student = []

    i = 1
    for each_line in class1_file:
        if i == 1:
            student.append(each_line[:-1] + ',FeaturePath\n')
            i += 1
        else:
            student.append(each_line[:-1] + ',D:\\Feature\\' + each_line[-9:-1] + '_face.bin(jpg)\n')

    class1_file = open('F:\\learn\\python\\Python???\\test\\studentInfo.csv','w')
    j = 0
    for i in student:
        if getUniqueLineStu(student, i,j):
            class1_file.write(i)
        j += 1
    class1_file.close()

def openFile(fileNameExternal):
    return open(fileNameExternal)

def getUniqueLineStu(_file, line,j):
    i = -1
    for line1 in _file :
        i += 1
        if i == j:
            return True
        #?????????
        if line1 == line:
            print '??????'
            errorInfo(line1[:-1] + ",repeat\n",'F:/learn/python/Python???/test/errStu.csv')#??????
            return False

    return True
#?????????
def getUniqueLine(_file, line,j):
    i = -1
    for line1 in _file :
        #???????????????????????????
        i += 1
        if i == j:
            return True     
        if line1[:8] == line[:8] and line[36:]==line1[36:]:
            print '??????'
            errorInfo(line1[:-1] + ",repeat\n","F:/learn/python/Python???/test/errorFile.csv")#??????
            return False

    return True

#???????????????
def errorInfo(line,errFile):
    writer = open(errFile,'a')
    writer.write(line)
    writer.close()
    print '??????????'
    print line[:-1]
    print '?????' + errFile + '?????\n'
    
    
#???????????????
def sortInfo(course_file):
    
    course = []
    t = True
    for each_line in course_file:
        each_line = each_line[:-2]
        if t:
            t = False
            continue
        temp = each_line.split(',')
        i = 8

        while i<len(temp):
            temp1 = temp[i].split('-')
            j = 0
            if len(temp1) > 1:
                #???????????
                if (temp1[0][-4:]).isdigit() and (temp1[1][-4:]).isdigit():
                    num = int(temp1[0][-4:-1] + temp1[0][-1])
                    s = int(temp1[1][-4:-1] + temp1[1][-1])-num
                else:
                    print '????????????'
                    errorInfo(each_line + '"\n',"F:/learn/python/Python???/test/errorClass.csv")
                while j <= s:
                    if temp1[0][0] == '"':
                        temp1[0] = temp1[0][1:]
                    course.append(temp[2] + ',' + temp[3] + ',' + temp[0] + ',' + temp1[0][0:-4] + str(num + j)+ '\n' )
                    j += 1
            else:
                if (temp1[0][-4:]).isdigit():
                    course.append(temp[2] + ',' + temp[3] + ',' + temp[0] + ',' + temp1[0] + '\n' )
                else:
                    print '????????????'
                    errorInfo(each_line + '"\n',"F:/learn/python/Python???/test/errorClass.csv")
                 #   exit()
            i += 1
    return course;
#???????
def saveToFile(course_file):   
    courseInfo = open('F:\\learn\\python\\Python???\\test\\courseInfo.csv','w+') 
    courseInfo.write('CourseID,CourseName,TeacherID,ClassName\n')
    course = sortInfo(course_file);
    j = 0
    for i in course:
        if getUniqueLine(course, i,j) :
           
            courseInfo.write(i)
        j+=1
    courseInfo.close()
if  __name__ == '__main__' :
    fileNameExternal = 'F:\\learn\\python\\Python???\\.CSV???\\courseProgress.csv'
    fileNameInside = 'F:\\learn\\python\\Python???\\test\\courseInfo.csv'
    fileNameStu = 'F:\\learn\\python\\Python???\\.CSV???\\???1401.csv'
    message = ['TeacherID','TeacherName','CourseID','CourseName','Start-Stop','Day','Sec','Room','ClassNums']
    message1  = ['StuID ','StuName','ClassID ','WechatID']
    if CheckInfo.check(fileNameStu,message1):
        try:        
            sortStu()
        except IOError,e:
            print '??????????',e
        
    if CheckInfo.check(fileNameExternal,message):
        try:
            course_file = openFile(fileNameExternal)
        except IOError, e:
            print('????????',e)
        try:
            saveToFile(course_file)
        except IOError, e:
            print('????????',e)
    print '??????'
        
