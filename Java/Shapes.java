abstract class Shape {
    abstract int numberOfSides();
}

class Rectangle extends Shape {
    int numberOfSides() {
        return 4;
    }
}

class Triangle extends Shape {
    int numberOfSides() {
        return 3;
    }
}

class Hexagon extends Shape {
    int numberOfSides() {
        return 6;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();

        System.out.println("Number of sides in a Rectangle: " + rectangle.numberOfSides());
        System.out.println("Number of sides in a Triangle: " + triangle.numberOfSides());
        System.out.println("Number of sides in a Hexagon: " + hexagon.numberOfSides());
    }
}
