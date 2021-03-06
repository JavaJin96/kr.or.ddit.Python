import sys 
from PyQt5 import uic 
from PyQt5.QtWidgets import QApplication, QMainWindow 
import time
import threading
form_class = uic.loadUiType("./main10.ui")[0] 


# 1. WindowClass 생성후 QmainWindow, form_class 상속 받기
# 2. 생성자 호출후에 부모의 객체 생성후 setupUi 함수? 생성
# 3. pb(qt에서 준 아이디). 이벤트. connect(self.btnClick)
# 4. btnClick(self) : 정의하기 (이벤트 정하기 self.lbl.setText("good evening")
# 5. __name__== "__main__": 구문 : python은 import를 할때도 한번 실행되기 때문에 중복 실행을 방지하기 위해서 사용하는 구문
# __name__ : 인터프리터가 실행전에 만들어준 글로벌 변수와
# __main__ : 현재 실행하는 부분(java의 main메서드) / 파이썬 인터프리터가 최초로 실행하기 때문에 프로그램의 시작점. 
# 따라서 : import된 전역변수인 __name__이 현재 py에서 최초로 시작된 녀석인가 식별하여, 둘이 같을때(최초로 실행되었을 때) 코드를 실행하기 위함


class WindowClass(QMainWindow, form_class):
    def __init__(self): 
        super().__init__() 
        self.setupUi(self)
    
        self.pb.clicked.connect(self.btnClick)
    
    def btnClick(self): 
        
        
            

        t = threading.Thread(target=self.myrun)
        t.start()
        
    def myrun(self):
        for i in range(200) :
            time.sleep(0.5)
            a = self.lbl.text()
            aa = int(a)
            aa += 1
            self.lbl.setText(str(aa))
    
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()
