package Day17;

/**
 * 成员内部类是定义在另一个类的内部的类，它可以访问外部类的所有成员，包括私有成员。成员内部类的写法如下：
 */
public class Outer1 {

    private int outerFeild;

    public class InnerClass{
        private int innerFeild;

        public void innerMethod(){
            outerFeild = 10;
        }

    }
}
