

num1 = input()

if bool(int(num1)):
    if int(num1)%2 == 0 :
        res = "C"
    else :
        res = "D"
elif not bool(int(num1)):
    if int(num1)%2 == 1 :
        res = "A"
    else :
        res = "B"
        
print(res)





