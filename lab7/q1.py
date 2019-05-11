import _thread
import time
import threading

	
class myThread (threading.Thread):
   def __init__(self, threadID, name, n):
      threading.Thread.__init__(self)
      self.threadID = threadID
      self.name = name
      self.n = n
      self.sum1 = 0
   def run(self):
   	  for i in range(1,self.n+1):
   	     if(self.n%i == 0):
   	        self.sum1 += i
	

print("Enter 2 numbers")
n1 = int(input())
n2 = int(input())
thread1 = myThread(1, "Thread-1", n1)
thread2 = myThread(2, "Thread-2", n2)
thread1.start()
thread2.start()
thread1.join()
thread2.join()
if(thread1.sum1 == thread2.sum1):
	print("Numbers are amicable")
else:
	print("Numbers are not amicable")
