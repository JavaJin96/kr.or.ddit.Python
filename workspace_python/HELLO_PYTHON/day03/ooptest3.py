class LeeJY():
    def __init__(self):
        self.money = 100000000000
    def dirtymoney(self, amount):
        self.money += amount
        
class Messi():
    def __init__(self):
        self.lever_soccer = 100
    def getOrder(self):
        self.lever_soccer -= 1
        
class LeeYJ(LeeJY, Messi):
    def __init__(self):
        LeeJY.__init__(self)
        Messi.__init__(self)
    


if __name__ == "__main__":
    ee = LeeYJ()
    print(ee.money)
    print(ee.lever_soccer)

    ee.dirtymoney(1000000000)
    ee.getOrder()

    print(ee.money)
    print(ee.lever_soccer)
