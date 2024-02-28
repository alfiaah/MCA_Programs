//ameArea(Rectang to calculate the perimeter and area of the rectangle. Define another member functiole) that has one parameter of type Rectangle. sameArea returns 1 if the two Rectangles have the same area, and returns 0 if they don't. Use appropriate constructors to initialize the member variables(Use both default and parameterized constructor) Write a main function to create two rectangle objects and disp

class Rectangle {
    double length;
    double width;

    // Default Constructor
    Rectangle() {
        length = 0;
        width = 0;
    }

    // Parameterized Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Function to check if two rectangles have the same area
    int sameArea(Rectangle other) {
        double thisArea = this.calculateArea();
        double otherArea = other.calculateArea();
        if (thisArea == otherArea) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Pgrm_8_1 {
    public static void main(String[] args) {
        // Creating Rectangle objects using default and parameterized constructors
        Rectangle rectangle1 = new Rectangle(); // Default constructor
        Rectangle rectangle2 = new Rectangle(5, 4); // Parameterized constructor
    
        // Displaying the details of Rectangle 1
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());
    
        // Displaying the details of Rectangle 2
        System.out.println("\nRectangle 2:");
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
    
        // Checking if the two rectangles have the same area
        if (rectangle1.sameArea(rectangle2) == 1) {
            System.out.println("\nThe two rectangles have the same area.");
        } else {
            System.out.println("\nThe two rectangles do not have the same area.");
        }
    }
    