package Day16;

public interface IA {

    //终身学习

    //必须是 public、static 和 final 修饰符的常量，因为接口中的成员变量默认是 public static final 的。
    //由于成员变量是 final 的，所以它们必须在定义时被初始化，且不能再被修改。
    //成员变量通常会被定义为接口的属性或配置项。
    int MAX_COUNT = 10; // public static final int MAX_COUNT = 10;

    public static final int MAX_COUNT_2 = 11;

    //抽象方法：只有声明而没有实现的方法。
    void print();
    //默认方法：使用 default 关键字定义，可以在接口中提供默认实现，实现类也可以选择重写它。
    default void print1(){
        System.out.println("a");
    }
    //静态方法：使用 static 关键字定义，可以直接通过接口调用，而不需要实例化接口。
    static void print2(){
        System.out.println("b");
    }
    //私有方法：使用 private 关键字定义，只能在接口内部被调用，用于封装重复的代码逻辑。
    private void print3(){
        System.out.println("c");
    }
}
