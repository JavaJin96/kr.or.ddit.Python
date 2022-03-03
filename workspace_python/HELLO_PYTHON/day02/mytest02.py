# 첫째수를 입력하시오, 4를 입력
# 끝수를 입력하시오, 6을 입력
# ****
# *****
# ******


num1 = int(input("첫수를 입력하세요."))
num2 = int(input("두번째수를 입력하세요."))

for i in range(num1, num2+1):
    print("*"*i)
    
    
# java의 print와 같음
print("a", end="")
print("b")
    
def drawStar(cnt):
    txt = "";
    for i in range(cnt):
        txt += "*"
    print(txt)
        
        
drawStar(4)
drawStar(5)
drawStar(6)