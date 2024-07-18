def is_palindrome(num):
    """
    Checks if a number is a palindrome.
    """
    original_num = num
    reversed_num = 0
    
    while num > 0:
        digit = num % 10
        reversed_num = reversed_num * 10 + digit
        num //= 10
    
    return original_num == reversed_num

def reverse_and_add(num):
    """
    Reverses the digits of a number and adds them to the original.
    """
    original_num = num
    reversed_num = 0
    
    while num > 0:
        digit = num % 10
        reversed_num = reversed_num * 10 + digit
        num //= 10
    
    return original_num + reversed_num

def main():
    num = int(input("Enter a number: "))
    
    while not is_palindrome(num):
        num = reverse_and_add(num)
    
    print("The final palindrome is:", num)

if __name__ == "__main__":
    main()