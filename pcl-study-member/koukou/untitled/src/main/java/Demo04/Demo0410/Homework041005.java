package Demo04.Demo0410;

import java.io.*;
import java.util.*;

public class Homework041005 {
    //2、读取文本文件中的用户列表数据，保存为Java中的集合元素，根据用户的年龄排序后依次输出
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("./User.txt",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        List<User> user = new ArrayList<User>();
        user.add(new User("A",18,'男'));
        user.add(new User("B",20,'女'));
        user.add(new User("C",24,'男'));
        user.add(new User("D",22,'女'));
        oos.writeObject(user);

        FileInputStream fis = new FileInputStream("User.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<User> us = (List<User>) ois.readObject();
        java.util.Collections.sort(us);
        for(User u:us){
            System.out.println(u);
        }
    }
}
class User implements java.lang.Comparable<User>,Serializable{
    String name;
    int age;
    char sex;
    public int compareTo(User that) {
        return age - that.age;
    }
    public User(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String toString(){
        return "姓名"+name+" 年齡"+age+" 性別"+sex;
    }
}