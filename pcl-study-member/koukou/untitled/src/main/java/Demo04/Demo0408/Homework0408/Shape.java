package Demo04.Demo0408.Homework0408;

public abstract class Shape {
    protected double area;
    protected double perimeter;

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }
}
