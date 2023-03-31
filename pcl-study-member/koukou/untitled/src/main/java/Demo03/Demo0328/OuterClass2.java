package Demo03.Demo0328;

/**
 * 局部内部类是定义在方法内部的类，它只能在定义它的方法内部使用。局部内部类的写法如下：
 */
public class OuterClass2 {
    public void outerMethod() {
        class LocalClass {
            public void localMethod() {
                // 局部内部类的方法体
            }
        }
        LocalClass localObj = new LocalClass();
        localObj.localMethod();
    }
}
