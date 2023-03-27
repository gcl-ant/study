package Demo03.Demo0320;

public class Text032002 {
    public static void main(String[] args) {
        Text032003 liuyiYang = new Text032003("尻尻");
        System.out.println(liuyiYang.name);
//        System.out.println(Text032003.name);
        liuyiYang.printName2("123");
        Text032003.printName1("koukou");

        Text032003 liuyiYang2 = new Text032003("尻尻");
        System.out.println(liuyiYang2.name);
        liuyiYang.printName3("123");
    }
    //--------------------------------------------------
    int print3(int number){
        System.out.println(number + "1");
        return 0;
    }
    static int print2(int number){
        System.out.println(number + "2");
        return 0;
    }

    int print3(String number){
        System.out.println(number + "3");
        return 1;
    }
    static int print2(String number){
        System.out.println(number + "4");
        return 1;
    }
}
