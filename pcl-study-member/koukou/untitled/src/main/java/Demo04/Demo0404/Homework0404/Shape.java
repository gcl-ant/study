package Demo04.Demo0404.Homework0404;

public class Shape {
    int area;
    int perimeter;
    void calculateArea(){
    }
    void calculatePermeter(){
    }
}
class Rectangle extends Shape{
    void calculateArea(int a,int b){
        this.area = a*b;
        System.out.println(this.area);
    }
    void calculatePermeter(int a,int b){
        this.perimeter = 2*(a+b);
        System.out.println(this.perimeter);
    }
}
class Circle extends Shape{
    void calculateArea(int r){
        this.area = r*r;
        System.out.println(this.area + "π");
    }
    void calculatePermeter(int r){
        this.perimeter = 2*r;
        System.out.println(this.perimeter + "π");
    }
}
class CalculateShape{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.calculateArea(10,5);
        rectangle.calculatePermeter(10,5);
        circle.calculateArea(10);
        circle.calculatePermeter(10);
    }
}