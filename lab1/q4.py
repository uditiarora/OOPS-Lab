print("Enter size of array")
n = int(input())
print("Enter array elements")
list1 = []
for i in range(0,n):
	temp = int(input())
	list1.append(temp)
print("Enter k")
k = int(input())
flag = False
for i in range(0,n):
	for j in range(i+1,n):
		if(list1[i]+list1[j]==k):
			flag = True;
			break;
if(flag==True):
	print("Yes")
else:
	print("No")
