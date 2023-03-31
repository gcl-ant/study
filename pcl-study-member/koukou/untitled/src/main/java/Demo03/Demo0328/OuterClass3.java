package Demo03.Demo0328;

/**
 * 匿名内部类是没有名字的内部类，通常用于创建一个实现某个接口或继承某个类的对象。匿名内部类的写法如下：
 */
public class OuterClass3 {
    public void outerMethod() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // 匿名内部类的方法体
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
