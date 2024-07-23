def main():
    n = int(input("Enter the number of students: "))
    
    student_dict = {} 

    for i in range(1, n + 1):
        print(f"\nEnter details for student {i}:")
        name = input("Enter student's name: ")
        roll_no = input("Enter student's roll number: ")
        total_marks = float(input("Enter student's total marks: "))
        
        student_dict[i] = {
            'name': name,
            'roll_no': roll_no,
            'total_marks': total_marks
        }
    
    highest_marks_student = None
    highest_marks = -1
    
    for student_id, details in student_dict.items():
        if details['total_marks'] > highest_marks:
            highest_marks = details['total_marks']
            highest_marks_student = details

    if highest_marks_student:
        print("\nDetails of the student with the highest total marks:")
        print(f"Name: {highest_marks_student['name']}")
        print(f"Roll Number: {highest_marks_student['roll_no']}")
        print(f"Total Marks: {highest_marks_student['total_marks']}")
    else:
        print("\nNo student records found.")

if __name__ == "__main__":
    main()