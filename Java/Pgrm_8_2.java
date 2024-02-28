interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    boolean hasSameArea(Rectangle other) {
        return this.calculateArea() == other.calculateArea();
    }
}

public class Pgrm_8_2 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 4);
        Rectangle rectangle2 = new Rectangle(3, 6);

        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());

        if (rectangle1.hasSameArea(rectangle2)) {
            System.out.println("\nThe two rectangles have the same area.");
        } else {
            System.out.println("\nThe two rectangles do not have the same area.");
        }
    }
}
