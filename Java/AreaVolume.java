interface Operations {
    double PI = 3.14; // Constant PI
    double area();
    double volume();
}

class Cylinder implements Operations {
    private double radius;
    private double height;

    // Constructor
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate area
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    // Calculate volume
    public double volume() {
        return PI * radius * radius * height;
    }
}

public class AreaVolume {
    public static void main(String[] args) {
        // Create a Cylinder object
        Cylinder cylinder = new Cylinder(5.0, 10.0);

        // Calculate and print area
        double area = cylinder.area();
        System.out.println("Area of the cylinder: " + area);

        // Calculate and print volume
        double volume = cylinder.volume();
        System.out.println("Volume of the cylinder: " + volume);
    }
}

