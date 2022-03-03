# 1~9 까지 중복없이 3개 뽑기
import random

arr = [1,2,3,4,5,6,7,8,9]
arr3 = []


while not len(arr3) == 3 :
    rnd = int(9* random.random())
    a = arr[rnd]
    if a == -1:
        pass
    else:
        arr3.append(arr[rnd])
        arr[rnd] = -1
        
    
    
     
print(arr3)









