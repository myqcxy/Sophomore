#coding:utf-8
val = input("��������¶ȱ�ʾ���ŵ��¶�ֵ�����磺32C����")
if val[-1] in ['c','C']:
    f = 1.8 * float(val[0:1]) + 32
    print("ת������¶�Ϊ��%.2fF"%f)
elif val[-1] in ['F','f']:
    c = (float(val[0:1]) - 32) / 1.8
    print("ת������¶�Ϊ��%.2fC"%c)
else:
    print("��������")