public class Rectanglee {
    private double length;
    private double width;
    
    public Rectanglee() {
        length = 0;
        width = 0;
    }
    
    public Rectanglee(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    public int sameArea(Rectanglee other) {
        double area1 = this.calculateArea();
        double area2 = other.calculateArea();
        if (area1 == area2) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public static void main(String[] args) {
        Rectanglee rectangle1 = new Rectanglee(5, 4);
        Rectanglee rectangle2 = new Rectanglee(4, 5);
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());

        if (rectangle1.sameArea(rectangle2) == 1) {
            System.out.println("\nBoth rectangles have the same area.");
        } else {
            System.out.println("\nThe rectangles don't have the same area.");
        }
    }
}
