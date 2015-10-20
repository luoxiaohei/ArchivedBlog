# coding: utf-8
class Operation:
    NumberA = 0
    NumberB = 0
    def GetResult(self):
        pass

class OperationAdd(Operation):
    def GetResult(self):
        return self.NumberA + self.NumberB

class OperationSub(Operation):
    def GetResult(self):
        return self.NumberA - self.NumberB

class OperationMul(Operation):
    def GetResult(self):
        return self.NumberA * self.NumberB

class OperationDiv(Operation):
    def GetResult(self):
        if self.NumberB == 0:
            raise Exception(u'除数不能为0.')
        return self.NumberA / float(self.NumberB)

class OperationFactory(Operation):
    operation = dict()
    operation['+'] = OperationAdd()
    operation['-'] = OperationSub()
    operation['*'] = OperationMul()
    operation['/'] = OperationDiv()

    def CreateOperation(self, operate):
        oper = None
        if operate in self.operation:
            oper = self.operation[operate]
        return oper

if __name__ == '__main__':
    oper = OperationFactory().CreateOperation(raw_input('Operator: '))
    oper.NumberA = input('NumberA: ')
    oper.NumberB = input('NumberB: ')
    print 'Result:',oper.GetResult()
