package homeworkApirl;

//子类圆的创建的创建
public class Circle extends Shape {
    protected int r;

    //有形参的构造方法
    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    //方法的重写
    public double getArea() {
        return Math.PI * r * r;
    }

    public double getC() {
        return Math.PI * 2 * r;
    }

    //子类矩形类的继承
    public class Rectangle extends Shape {
        private final int weight;
        private final int height;

        public Rectangle(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public int getweight() {
            return weight;
        }

        public int getheight() {
            return height;
        }

        //方法的重写
        public double getArea() {
            return weight * height;
        }

        public double getC() {
            return 2 * weight * height;
        }
    }
}
