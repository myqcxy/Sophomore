def sortStu():
    
    class1_file = open('F:\\learn\\python\\Python作业\\.CSV文件\\软件1401.csv')

    student = []

    i = 1
    for each_line in class1_file:
        if i == 1:
            student.append(each_line[:-1] + ',FeaturePath\n')
            i += 1
        else:
            student.append(each_line[:-1] + ',D:\\Feature\\' + each_line[-9:-1] + '_face.bin(jpg)\n')

    class1_file = open('F:\\learn\\python\\Python作业\\.CSV文件\\studentInfo.csv','w')
    for i in student:
        class1_file.write(i)
    class1_file.close()

