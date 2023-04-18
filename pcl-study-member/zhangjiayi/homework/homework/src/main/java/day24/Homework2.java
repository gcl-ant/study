package day24;

import java.io.*;

    public class Homework2 {

        // 将对象保存到文本文件中
        public static void serialize(Object object, String fileName) throws IOException {
            try (FileOutputStream fileOut = new FileOutputStream(fileName);
                 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(object);
            }
        }

        // 从文本文件中还原对象
        public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
            try (FileInputStream fileIn = new FileInputStream(fileName);
                 ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
                return objectIn.readObject();
            }
        }

        public static void main(String[] args) throws IOException, ClassNotFoundException {
            // 创建一个对象
            MyClass obj1 = new MyClass("John", 25);

            // 将对象保存到文本文件中
            serialize(obj1, "my_object.txt");

            // 从文本文件中还原对象
            MyClass obj2 = (MyClass) deserialize("my_object.txt");

            System.out.println(obj2.getName());  // 输出 "John"
            System.out.println(obj2.getAge());   // 输出 25
        }
    }

    // 定义一个可以序列化的类
    class MyClass implements Serializable {
        private String name;
        private int age;

        public MyClass(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


