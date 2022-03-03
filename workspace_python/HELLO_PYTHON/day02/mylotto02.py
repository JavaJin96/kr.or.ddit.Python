# 1~9 까지 중복없이 3개 뽑기
import random

arr = [1,2,3,4,5,6,7,8,9,10,
       21,22,23,24,25,26,27,28,29,20,
       31,32,33,34,35,36,37,38,39,30,
       41,42,43,44,45,46,47,48,49,40,
       41,42,43,44,45
       ]

rarr = []

while not len(rarr) == 6 :
    rnd = int(45* random.random())
    a = arr[rnd]
    if a == -1:
        pass
    else:
        rarr.append(arr[rnd])
        arr[rnd] = -1

print(rarr)









