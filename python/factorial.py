def factorial(n):
    factorials = {}

    def _factorial(x):
        if x in factorials:
            return factorials[x]
        elif x == 0:
            return 1
        else:
            result = x * _factorial(x-1)
            factorials[x] = result
            return result

    return _factorial(n)

print('factorial is',factorial(5))  
print('factorial is',factorial(10))