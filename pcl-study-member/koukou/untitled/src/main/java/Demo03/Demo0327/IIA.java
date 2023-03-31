package Demo03.Demo0327;

public abstract class IIA {
    //可以是任意修饰符的变量，例如 public、protected、private 或默认访问修饰符。
    //通常会被定义为 protected 访问修饰符，以便于子类能够访问。
    //可以被子类继承和访问，子类也可以通过 super 关键字调用父类的成员变量。
    protected String name;
    protected int age;
    static int age2;
    //抽象方法：只有声明而没有实现的方法。
    abstract void print();
    //非抽象方法：有方法体的方法，可以被子类继承和实现，也可以被抽象类本身直接调用。
    void print1() {
        System.out.println("a");
    }
    //静态方法：使用 static 关键字定义，可以直接通过类名调用。
    static void print2(){
        System.out.println("b");
    }
    //私有方法：使用 private 关键字定义，只能在抽象类内部被调用，用于封装重复的代码逻辑。
    private void print3(){
        System.out.println("c");
    }
    //受保护方法：使用 protected 关键字定义，只能被该类及其子类调用。
    protected void print4(){
        System.out.println("c");
    }
    //類中類
    class A{
        A(){
            print4();
        }
    }
}
