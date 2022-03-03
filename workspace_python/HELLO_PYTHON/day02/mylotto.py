# 1~9 까지 중복없이 3개 뽑기
import random

arr = [range(1, 45+1)]

print(arr)


for i in range(100) :    
    rnd = int(45 * random.random()) 
    a = arr[1]
    b = arr[rnd]
    arr[1] = b
    arr[rnd] = a
     
      
print(arr[1], arr[2], arr[3], arr[4], arr[5], arr[6])











