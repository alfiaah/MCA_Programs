def menu():
    print("String Operations Menu")
    print("1. Check if a String is a Substring of Another String")
    print("2. Count Occurrences of a Character")
    print("3. Replace a Substring with Another Substring")
    print("4. Convert to Capital Letters")
    print("5. Exit")

def is_substring():
    string1 = input("Enter the main string: ")
    substring = input("Enter the substring to check: ")
    if substring in string1:
        print(f"'{substring}' is a substring of '{string1}'")
    else:
        print(f"'{substring}' is not a substring of '{string1}'")

def count_occurrences():
    string1 = input("Enter the string: ")
    char = input("Enter the character to count: ")
    count = string1.count(char)
    print(f"The character '{char}' occurs {count} times in '{string1}'")

def replace_substring():
    string1 = input("Enter the string: ")
    old_substring = input("Enter the substring to replace: ")
    new_substring = input("Enter the new substring: ")
    result = string1.replace(old_substring, new_substring)
    print(f"Original string: '{string1}'")
    print(f"New string: '{result}'")

def convert_to_uppercase():
    string1 = input("Enter the string: ")
    result = string1.upper()
    print(f"Uppercase string: '{result}'")

while True:
    menu()
    choice = input("Enter your choice (1-5): ")

    if choice == "1":
        is_substring()
    elif choice == "2":
        count_occurrences()
    elif choice == "3":
        replace_substring()
    elif choice == "4":
        convert_to_uppercase()
    elif choice == "5":
        print("Exiting the program...")
        break
    else:
        print("Invalid choice. Please try again.")