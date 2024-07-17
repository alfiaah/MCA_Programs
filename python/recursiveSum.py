def sumofnumbers(n):
 if n==0:
    return 0
 else:
    return n + sumofnumbers(n-1)
result = sumofnumbers(10)
print(f"Sum of numbers from 0 to 10: {result}")