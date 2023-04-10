package Demo04.Demo0408;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test040801 {
    public static void main(String[] args) {
//        try{
//            FileOutputStream fos = new FileOutputStream(".AB.txt",true);
//            DataOutputStream dos = new DataOutputStream(fos);
//
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        String aaa = "aaa";
    }
}
class AAA extends Test040801{
    String message;
    int point;
    public AAA(String aaa){
        this.message = aaa;
        this.point =+1 ;
    }
}
class BBB extends Test040801{
    String message;
    int point;
    public BBB(String bbb){
        this.message = bbb;
        this.point =+1 ;
    }
}