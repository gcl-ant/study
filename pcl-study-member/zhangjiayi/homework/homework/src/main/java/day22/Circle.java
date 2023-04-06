package day22;

public class Circle extends Shape {
    private double radius;

    // 构造方法
    public Circle(double radius) {
        this.radius = radius;
    }

    // 重写计算面积方法
    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    // 重写计算周长方法
    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    // Getter 和 Setter 方法
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
