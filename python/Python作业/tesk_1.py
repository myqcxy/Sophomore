class1_file = open('D:\\learn\\python\\Python作业\\.CSV文件\\软件1401.csv')
course_file = open('D:\\learn\\python\\Python作业\\.CSV文件\\courseProgress.csv')
teacher_file = open('D:\\learn\\python\\Python作业\\.CSV文件\\teacherInfo.csv')

student = []
course = []
teacher = []

i = 1
for each_line in class1_file:
    if i == 1:
        student.append(each_line[:-1] + ',FeaturePath\n')
        i += 1
    else:
        student.append(each_line[:-1] + ',D:\\Feature\\' + each_line[-9:-1] + '_face.bin(jpg)\n')
    

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
            num = int(temp1[0][-4:-1] + temp1[0][-1])
            s = int(temp1[1][-4:-1] + temp1[1][-1])-num
            while j <= s:
                if temp1[0][0] == '"':
                    temp1[0] = temp1[0][1:]
                course.append(temp[2] + ',' + temp[3] + ',' + temp[0] + ',' + temp1[0][0:-4] + str(num + j)+ '\n' )
                j += 1
        else:
            course.append(temp[2] + ',' + temp[3] + ',' + temp[0] + ',' + temp1[0] + '\n' )
  
        i += 1

    
    
        
    

for each_line in teacher_file:
    
    teacher.append(each_line)


class1_file = open('D:\\learn\\python\\Python作业\\.CSV文件\\studentInfo.csv','w')
for i in student:
    class1_file.write(i)
class1_file.close()

courseInfo = open('D:\\learn\\python\\Python作业\\.CSV文件\\courseInfo.csv','w')
courseInfo.write('CourseID,CourseName,TeacherID,ClassName\n')
for i in course:
    courseInfo.write(i)
courseInfo.close()

