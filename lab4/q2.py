print("Enter range")
a = int(input())
b = int(input())
print("Enter pattern to be searched")
num = input()
count = 0
for i in range(0,b):
	temp = str(i) + num
	temp2 = int(temp)
	if(temp2>=a and temp2<=b):
		count += 1
		print(temp2,end = " " )
	if(temp2>b):
		break
for i in range(0,b):
	temp = num + str(i)
	temp2 = int(temp)
	if(temp2>=a and temp2<=b):
		count += 1
		print(temp2,end = " " )
	if(temp2>b):
		break
print("")
print("Total count = ",count)
