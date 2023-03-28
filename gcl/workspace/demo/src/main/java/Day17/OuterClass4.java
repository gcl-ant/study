package Day17;

/**
 * 静态内部类是定义在另一个类内部的类，但它是静态的，不依赖于外部类的实例，可以直接通过外部类名访问。静态内部类的写法如下：
 */
public class OuterClass4 {
    private static int outerStaticField;

    public static class StaticInnerClass {
        private int innerField;

        public void innerMethod() {
            // 访问外部类的静态成员
            outerStaticField = 10;
        }
    }

    public void outerMethod(){
        StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
}
