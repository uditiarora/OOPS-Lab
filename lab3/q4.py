import math
def passwordchecker(pwd):
    splchar=["@","#","$","%","^","&","*","(",")",":",";","{","}","[","]","<",">"]
    if len(pwd)<5 or len(pwd)>12:
        return False
    if pwd.islower()==False:
        return False
    if pwd.isalnum()==False:
        return False
    if pwd.isalpha()==True or pwd.isdigit()==True:
        return False
    if repetition(pwd):
        return False
    return True

def repetition(pwd):
    length=len(pwd)
    len2=int(length/2)
    for i in range(1,len2+1):
        for j in range(0,length-i):
            tocheck=pwd[j:i+j]
            check=pwd[i+j:i+j+i]
            if check==tocheck:
                return True
    return False   

def main():
    pwd=input("enter the password:")
    check=passwordchecker(pwd)
    if check:
        print("correct password\n")
    else:
        print("incorrect password\n")
    #print(check)

main() 
