def set_union(set1, set2):
    return set1.union(set2)

def set_intersection(set1, set2):
    return set1.intersection(set2)

def set_difference(set1, set2):
    return set1.difference(set2)

# Example usage:
if __name__ == "__main__":
    set1 = {1, 2, 3, 4}
    set2 = {3, 4, 5, 6}

    print("Set 1:", set1)
    print("Set 2:", set2)

    choice = 0
    while choice != 4:
        print("\nChoose an operation:")
        print("1: Set Union")
        print("2: Set Intersection")
        print("3: Set Difference")
        print("4: Exit")

        choice = int(input("Enter your choice (1-4): "))

        if choice == 1:
            print("Union of Set 1 and Set 2:", set_union(set1, set2))
        elif choice == 2:
            print("Intersection of Set 1 and Set 2:", set_intersection(set1, set2))
        elif choice == 3:
            print("Difference (Set 1 - Set 2):", set_difference(set1, set2))
        elif choice == 4:
            print("Exiting the program...")
        else:
            print("Invalid choice. Please enter a number from 1 to 4.")

    print("Program ended.")