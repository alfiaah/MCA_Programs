def calculate_electricity_bill(units):
    total_bill = 0
    
    if units <= 200:
        total_bill = units * 0.50
    elif units <= 400:
        total_bill = 200 * 0.50 + (units - 200) * 0.65
    elif units <= 600:
        total_bill = 200 * 0.50 + 200 * 0.65 + (units - 400) * 0.80
    else:
        total_bill = 200 * 0.50 + 200 * 0.65 + 200 * 0.80 + (units - 600) * 1.00
    
    if total_bill > 400:
        total_bill *= 1.15
    
    if total_bill < 100:
        total_bill = 100
    
    return total_bill

units = int(input("Enter the number of units consumed: "))

bill = calculate_electricity_bill(units)
print("The electricity bill is: Rs.", bill)