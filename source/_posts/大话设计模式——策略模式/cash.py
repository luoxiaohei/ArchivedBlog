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
    def __init__(self, csuper):
        self.cs = csuper

    def GetResult(self, money):
        return self.cs.acceptCash(money)

if __name__ == '__main__':
    money = input(u'Money: ')
    stratey = {}
    stratey[1] = CashContext(CashNormal())
    stratey[2] = CashContext(CashRebate(0.8))
    stratey[3] = CashContext(CashReturn(300, 100))
    cashType = None
    while cashType not in stratey:
        cashType = input(u'1. Normal.\n2. Discount of twenty percent.\n 3.Per more than $300 cashback $100.\nPay type: ')
        if cashType in stratey:
            print cashType
            print u'Amount Paid: %.2f' % stratey[cashType].GetResult(money)
        else:
            print u'Pay type error.\n'

