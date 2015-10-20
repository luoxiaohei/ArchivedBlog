# coding: utf-8

class CashSuper:
    def acceptCash(self, money):
        pass

class CashNormal(CashSuper):
    def acceptCash(self, money):
        return money

class CashRebate(CashSuper):
    def __init__(self, moneyRebate):
        self.moneyRebate = moneyRebate

    def acceptCash(self, money):
        return money * self.moneyRebate

class CashReturn(CashSuper):
    def __init__(self, moneyCondition, moneyReturn):
        self.moneyCondition = moneyCondition
        self.moneyReturn = moneyReturn

    def acceptCash(self, money):
        result = money
        if money >= self.moneyCondition:
            result = money - (int(money / self.moneyCondition) * self.moneyReturn)
        return result


class CashContext:
    stratey = {}
    stratey[1] = CashNormal()
    stratey[2] = CashRebate(0.8)
    stratey[3] = CashReturn(300, 100)
    def __init__(self, cashType):
        if cashType in self.stratey:
            self.cs = self.stratey[cashType]
        else:
            raise Exception('cashType error.')

    def GetResult(self, money):
        return self.cs.acceptCash(money)

if __name__ == '__main__':
    money = input(u'Money: ')
    repeat = True
    while repeat is True:
        try:
            cashType = input(u'1. Normal.\n2. Discount of twenty percent.\n3. Per more than $300 cashback $100.\nPay type: ')
            csuper = CashContext(cashType)
            print u'Amount Paid: %.2f' % csuper.GetResult(money)
            repeat = False
        except Exception:
            print '\nPay type error.\n'
