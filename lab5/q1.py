string = input("Enter string")
string = string.lower()
count = [0 for i in range(26)]
n = len(string)
for i in range(n):
	temp = ord(string[i]) - ord('a')
	count[temp] += 1
flag = False
for i in range(26):
	if(count[i] != 1):
		flag = True
		break
if(flag == True):
	print("Not a perfect string")
else:
	print("Perfect String")

