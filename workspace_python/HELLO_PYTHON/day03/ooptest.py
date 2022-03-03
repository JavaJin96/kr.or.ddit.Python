class Animal :
    def __init__(self):
        print("생성자")
        self.age = 0 
    
    def eatAge(self):
        self.age += 1
    
    def __del__(self):
        print("소멸자")

class Human(Animal) :
    def __init__(self):
        print("생성자")
        super().__init__()
        self.skill_lang = 0
        
    def momstouch(self, stroke):
        self.skill_lang += stroke
        
    def __del__(self):
        print("소멸자")


if __name__ == "__main__":
    a = Human()
    print(a.skill_lang)
    print(a.age)

    a.eatAge()
    a.momstouch(6)
    
    print(a.age)
    print(a.skill_lang)
    
    
    
    