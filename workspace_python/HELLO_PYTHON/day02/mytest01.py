# 가위 바위 보
import random

# 가위 1 / 바위 2 / 보 3


def showdown (user):
    result = "";
    rnd = int(3*random.random()+1)
    if user == rnd :
        result = "비겼습니다."
        
    if user == 1 :
        if rnd == 3 :
            result = "이겼습니다."
        elif rnd == 2 :
            result = "졌습니다."
    
    elif user == 2 :
        if rnd == 1 :
            result = "이겼습니다."
        elif rnd == 3 :
            result = "졌습니다."
            
    elif user == 3 :
        if rnd == 2 :
            result = "이겼습니다."
        elif rnd == 1 :
            result = "졌습니다."
            
    return result


user = input("가위/바위/보를 입력해주세요.")
usernum = 0;
if(user == "가위"):
    usernum = 1;
elif(user == "바위"):
    usernum = 2;
else:
    usernum = 3;

print("결과  :" , showdown(usernum))

