abstract class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return "Color: " + color;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String color, double radius) {
        super(color);

        if (radius <= 0) {
            radius = 1;
        }

        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle - " + super.toString()
                + ", Radius: " + radius
                + ", Area: " + area()
                + ", Perimeter: " + perimeter();
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        super(color);

        if (length <= 0) {
            length = 1;
        }

        if (width <= 0) {
            width = 1;
        }

        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle - " + super.toString()
                + ", Length: " + length
                + ", Width: " + width
                + ", Area: " + area()
                + ", Perimeter: " + perimeter();
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    Triangle(String color, double side1, double side2, double side3) {
        super(color);

        if (side1 <= 0) {
            side1 = 1;
        }

        if (side2 <= 0) {
            side2 = 1;
        }

        if (side3 <= 0) {
            side3 = 1;
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        double s = perimeter() / 2;

        return Math.sqrt(
            s * (s - side1) * (s - side2) * (s - side3)
        );
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle - " + super.toString()
                + ", Sides: " + side1 + ", "
                + side2 + ", " + side3
                + ", Area: " + area()
                + ", Perimeter: " + perimeter();
    }
}

public class ShapeManagementApp {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red", 5),
            new Rectangle("Blue", 6, 4),
            new Triangle("Green", 3, 4, 5),
            new Circle("Yellow", 3),
            new Rectangle("Purple", 8, 2)
        };
        double totalArea = 0;
        double totalPerimeter = 0;
        System.out.println("SHAPE MANAGEMENT");
        System.out.println();
        for (Shape shape : shapes) {
            System.out.println(shape);
            totalArea = totalArea + shape.area();
            totalPerimeter = totalPerimeter + shape.perimeter();
            System.out.println();
        }
        System.out.println("Total Area = " + totalArea);
        System.out.println("Total Perimeter = " + totalPerimeter);
        Shape largest = shapes[0];
        for (Shape shape : shapes) {
            if (shape.area() > largest.area()) {
                largest = shape;
            }
        }
        System.out.println();
        System.out.println("Shape with Largest Area:");
        System.out.println(largest);
    }
}
