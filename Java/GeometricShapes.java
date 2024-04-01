// Interface for calculating the area
interface Area {
    double getArea();
}

// Interface for calculating the volume
interface Volume {
    double getVolume();
}

// Base class Shape
class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

// Circle class
class Circle extends Shape implements Area {
    double radius;

    Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square class
class Square extends Shape implements Area {
    double side;

    Square(double side, String name) {
        super(name);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

// Cylinder class
class Cylinder extends Circle implements Volume {
    double height;

    Cylinder(double height, double radius, String name) {
        super(radius, name);
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Sphere class
class Sphere extends Circle implements Volume {
    Sphere(double radius, String name) {
        super(radius, name);
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

// Cube class
class Cube extends Square implements Volume {
    Cube(double side, String name) {
        super(side, name);
    }

    public double getVolume() {
        return side * side * side;
    }
}

// Glome class
class Glome extends Sphere implements Volume {
    Glome(double radius, String name) {
        super(radius, name);
    }

    public double getVolume() {
        return 0.5 * Math.PI * Math.PI * radius * radius * radius * radius;
    }
}

public class GeometricShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Circle");
        Square square = new Square(4.0, "Square");
        Cylinder cylinder = new Cylinder(10.0, 3.0, "Cylinder");
        Sphere sphere = new Sphere(6.0, "Sphere");
        Cube cube = new Cube(7.0, "Cube");
        Glome glome = new Glome(2.0, "Glome");

        System.out.println("Shape: " + circle.getName() + ", Area: " + circle.getArea());
        System.out.println("Shape: " + square.getName() + ", Area: " + square.getArea());
        System.out.println("Shape: " + cylinder.getName() + ", Volume: " + cylinder.getVolume());
        System.out.println("Shape: " + sphere.getName() + ", Volume: " + sphere.getVolume());
        System.out.println("Shape: " + cube.getName() + ", Volume: " + cube.getVolume());
        System.out.println("Shape: " + glome.getName() + ", Volume: " + glome.getVolume());
    }
}
