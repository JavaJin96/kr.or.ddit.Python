import threading
def showNum():
    for i in range(1000000) :
        if i%100 == 0 :
            print(str(i) + "\n")
        else :
            print(i, end="")
            
t = threading.Thread(target=showNum)


def showMunja():
    for i in range(1000000) :
        
        try :
            
            if i%100 == 0 :
                print(chr(i) + "\n")
            else :
                print(chr(i), end="")
                
        except :
            
            print("에러발생")

t2 = threading.Thread(target=showMunja)




if __name__ == "__main__":
    t.start()
    t2.start()
    
    
