class product():
	def __init__(self):
		self.productid=0
		self.name=""
		self.catid=0
		self.unitprice=0
	def addval(self,productid,name,catid,unitprice):
		self.productid=productid
		self.name=name
		self.catid=catid
		self.unitprice=unitprice

class ElectricalProduct(product):
	def __init__(self,voltrange,wattage,productid,name,catid,unitprice):
		self.voltrange=voltrange
		self.wattage=wattage
		self.addval(productid,name,catid,unitprice)
		self.display()
	def change(self,watt,price):
		self.wattage=watt
		self.unitprice=price
		self.display()
	def display(self):
		print ("product id:%d\n name:%s\n category id:%d\n unitprice:%d\n voltage range:%d\n wattage:%d\n"%(self.productid,self.name,self.catid,self.unitprice,self.voltrange,self.wattage))

def main():
	e1=ElectricalProduct(10,10,1,"comp",3,10000)
	print ("After change:\n")
	e1.change(11,20000)

main()
