
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }

    double calculateArea() {
        System.out.println("Calculating area of shape.");
        return 0;
    }
}


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }
}
class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a cylinder.");
    }

    @Override
    double calculateArea() {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Total Surface Area of Cylinder: " + surfaceArea);
        return surfaceArea;
    }
}


public class Mainnn {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(5, 10);

        System.out.println("Circle");
        circle.draw();
        circle.calculateArea();

        System.out.println("Cylinder");
        cylinder.draw();
        cylinder.calculateArea();
    }
}
