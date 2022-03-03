#출력할 구구단을 입력하세요.

num1 = input("출력할 구구단을 입력하세요.")

arr = range(1, 9+1)

for i in arr:
    result = int(num1) * i
    print (num1, "*", i, "=", result)
