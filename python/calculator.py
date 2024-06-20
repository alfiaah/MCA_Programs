fno=int(input('enter the 1st number '))
sno=int(input('enter the 2nd number '))


op=input("select the input from +,-,*,/ ")

if op=='+':
    print(fno + sno)
elif op=='-':
    print(fno - sno)
elif op=='*':
    print(fno * sno)
elif op=='/':
    if sno==0:
        print('Division by zero is not possible')
    else:
        print(fno / sno)
else:
    print("Invalid Output")
