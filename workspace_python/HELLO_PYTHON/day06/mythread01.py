def showNum():
    for i in range(1000000) :
        if i%100 == 0 :
            print(str(i) + "\n")
        else :
            print(i, end="")


def showMunja():
    for i in range(1000000) :
        
        try :
            
            if i%100 == 0 :
                print(chr(i) + "\n")
            else :
                print(chr(i), end="")
                
        except :
            
            print("에러발생")



if __name__ == "__main__":
    showNum()
    showMunja()