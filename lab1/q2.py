class Student:
	_marksE = 0
	def __init__(self):
		self._admno = 0
		self._name = ""

		self._marksS = 0
		self._marksM = 0
	
	def printcontents(self):
		print(self._admno,end=" ")
		print(self._name,end=" ")
		print(self._marksE,end=" ")
		print(self._marksS,end=" ")
		print(self._marksM,end=" ")
	def readData(self):
		print("Enter admission number, _name, and marks in English,Science and Maths")
		self._admno = int(input())
		self._name = input()
		self._marksE = float(input())
		self._marksS = float(input())
		self._marksM = float(input())
	def compute(self):
		total = self._marksE + self._marksS + self._marksM
		print("Total is : ",total)
	
		
obj1 = Student()
obj1.marksE = 100
obj1.compute()
obj1.printcontents()

