#첫수를 입력하세요.
#끝수를 입력하세요.
#합은 6입니다.

num1 = input("첫수를 입력하세요.")
num2 = input("끝수를 입력하세요.")

arr = range(int(num1), int(num2)+1)

count = 0;
for i in arr :
    count += i
print(count)