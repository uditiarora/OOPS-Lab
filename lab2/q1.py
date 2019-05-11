import math
string = input()
arr = [0]*256
maxi = - math.inf
for i in range(len(string)):
	arr[ord(string[i])] += 1
for i in range(256):
	maxi = max(maxi,arr[i])
for i in range(256):
	if(arr[i]==maxi):
		print(chr(i),end=" ")
