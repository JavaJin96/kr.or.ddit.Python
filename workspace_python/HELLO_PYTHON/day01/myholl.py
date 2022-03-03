import random
random = random.random() *100 + 1
flag = True


answer = int(random)%2
if answer == 1 : 
    aa = "홀"
elif answer == 0 :
    aa = "짝"


user = input("홀/짝 을 입력하시오.")

if user == aa: 
    print("정답입니다.")
else :
    print("틀렸습니다.")
    
    
  
    
    
