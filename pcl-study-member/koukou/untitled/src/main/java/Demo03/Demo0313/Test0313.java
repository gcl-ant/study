package Demo03.Demo0313;

public class Test0313 {
    public static void main(String[] args) {
        //if/else/switch
        int a = 1;

        if (a == 1){
            System.out.println("滿足條件");
        }
        System.out.println("----------");
        if (a == 1){
            System.out.println("滿足條件");
        } else {
            System.out.println("不滿足條件");
        }
        System.out.println("----------");
        if (a == 1){
            System.out.println("滿足條件");
        } else if(a == 2){
            System.out.println("不滿足條件");
        } else {
            System.out.println("其他情況");
        }
        System.out.println("----------");
        switch (a){
            case 1:
                System.out.println("a == 1");
                break;
            case 2:
                System.out.println("a == 2");
                break;
            case 3:
                System.out.println("a == 3");
                break;
            default://不滿足任何條件時產生，默認(一般不會用)
                System.out.println("其他情況");
                break;
        }
        System.out.println("----------");
        //作用域 {}的範圍
        System.out.println("了解作用域 {}的範圍");
        String str = "abc";
        int i1 = 5;
        if (str.length()==3){
            //此時這邊找的到i1
            int i2 = 3;
            //此時這邊找的到i2
        }
        //此時這邊找的到i1
        //此時這邊找不到i2
        //三元運算符
        String strstr = "abc";
        int i01 = 1;
//        i01 = strstr.length() >1 ?"a":"b";
        System.out.println("----------");
        //for/while/do while
        int i001 = 1;
        while(i001<5){
            System.out.println("while"+i001);
            i001++;
        }
        System.out.println("----------");
        do {
            System.out.println("do while" + i001);
            i001++;
        } while(i001<8);
        System.out.println("----------");
        //continue
        for(int i = 0 ; i < 5 ; i++ ){
            if( i % 2 == 0 ){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}