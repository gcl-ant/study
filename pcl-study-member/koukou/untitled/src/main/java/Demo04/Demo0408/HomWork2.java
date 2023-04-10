package Demo04.Demo0408;

import java.io.IOException;

public class HomWork2 {
    //将Java对象保存到文本文件中并还原
    //1.创建一个Java对象，这可以通过定义一个类来完成，并在该类中声明变量和方法。
    //
    //2.将Java对象序列化为一个字节序列，这可以通过将对象写入一个输出流中来完成，例如ObjectOutputStream。
    //
    //3.将字节序列写入文本文件中，这可以通过将字节序列转换为字符串，然后将其写入文本文件中来完成。
    //
    //4.从文本文件中读取字符串，并将其转换回字节序列。
    //
    //5.将字节序列反序列化为Java对象，这可以通过将字节序列读取到输入流中，例如ObjectInputStream。
    //
    //6.在Java程序中使用反序列化的对象。


    public static void main(String[] args) {
        MyClass myClass = new MyClass("xiaowangba", 12);

        try {
            ObjectSerializer.savaObj(myClass, "myClass.txt");
            MyClass loadClass = (MyClass) ObjectSerializer.loadObj("myClass.txt");

            System.out.println(loadClass.getName());
            System.out.println(loadClass.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
