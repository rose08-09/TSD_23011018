class Shape {
    void area() { // Base method
        System.out.println("Calculate area");
    }
}

class Circle extends Shape {
    void area() { // Overridden method
        double r = 5;
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        double l = 4, b = 3;
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

public class Area {
    public static void main(String[] args) {
        Shape s; // Reference of parent class

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
