package apr06;

public abstract class Shape {
    double area;
    double circumference;

    public abstract double getArea();

    public abstract double getCircumference();
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    @Override
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
