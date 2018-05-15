try:
    f = open('sdf')
except IOError,e:
    print ('IOError',e)

f.close()

