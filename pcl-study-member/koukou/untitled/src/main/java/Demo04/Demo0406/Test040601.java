package Demo04.Demo0406;

public class Test040601 implements Cloneable{
    static void f(Object o){
        System.out.println(o);
    }
    String name;
    int age;
    Test040601(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return " Name " + name + " Age " + age;
    }
//    @Override //引用類型 深克隆
//    protected Object clone() throws CloneNotSupportedException {
//        Test040601 s=(Test040601) super.clone();
//        s.name=new String(s.name);
//        return s;
//    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int i = 1;
        f(arr);
        f(i);
        Test040601 t1=new Test040601("A",20);
        Test040601 t2=new Test040601("B",18);
        System.out.println("t1.equals(t2)="+t1.equals(t2));
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        try {
            Test040601 t3=new Test040601("C",25);
            Test040601 t4=(Test040601) t3.clone();
            System.out.println(" t3==t4 "+(t3==t4));
            System.out.println(t4.toString());
            System.out.println(" t3.name==t4.name "+(t3.getName()==t4.getName()));
            System.out.println(" t3.age==t4.age "+(t3.getAge()==t4.getAge()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
