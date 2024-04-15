import java.util.Scanner;

// Custom exception class for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Student class definition
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor to initialize student attributes
    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // Method to validate age
    public void validateAge() throws InvalidAgeException {
        if (age < 15 || age > 21) {
            throw new InvalidAgeException("Age must be between 15 and 21.");
        }
    }
}

public class Students{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for student details
        System.out.println("Enter Roll No:");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Course:");
        String course = scanner.nextLine();

        try {
            // Create a student object
            Student student = new Student(rollNo, name, age, course);

            // Validate age
            student.validateAge();

            // Display student information
            student.displayInfo();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
