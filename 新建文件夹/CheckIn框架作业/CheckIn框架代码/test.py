import threading
import time


class Th(threading.Thread):
    def __init__(self):
        threading.Thread.__init__(self)

    def run(self):
        while True:
            now = time.strftime("%H%M",time.localtime())
            if int(now) > 1140 and int(now) < 1200:
                pass
            else:
                print now
                print 'now in 1140 and 1200'
                break

th = Th()
th.run()