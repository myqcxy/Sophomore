import csv

def check (_filename, message0) :
    
    csvfile = open(_filename, 'rb')
    reader = csv.reader(csvfile)
    #��ȡ�ļ���һ��
    message = reader.next()
    #��Ŵ�����
    Dict = {}
    #��ͷ��Ϣ����
    
    if message == message0:
        #��ȡ����
        count = 2
        for line in reader:
            print line
            if len(line) == len(message0):
                if line.count('') == 0:
                    pass
                else:
                    Dict.update({count: 'ĳ����ϢΪ��'})
            else:
                Dict.update({count: '������Ϣ������ƥ��'})
            #��ȡ��һ��
            count = count + 1

        if len(Dict) == 0:
            csvfile.close()
            return True

        else:
            csvfile.close()
            for key, value in Dict.items():
                print "Error:",key, value
            return False
    #��ͷ��Ϣ������
    else:
        csvfile.close()
        print "��ͷ��Ϣ���������д���"
        return False
