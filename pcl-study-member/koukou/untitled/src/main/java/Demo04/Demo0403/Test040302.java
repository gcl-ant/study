package Demo04.Demo0403;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test040302 {
    public static void main(String[] args) {
//        FileOutputStream fos = null;
//        DataOutputStream dos = null;
        try{
//            File file = new File("./aaa.txt");
            FileOutputStream fos = new FileOutputStream("./aaa.txt",true);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(100);
            dos.writeDouble(3.141592654);
            dos.writeUTF("abc");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
//            if (dos!=null)
//                try{
//                    dos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            if (fos!=null)
//                try{
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
        }
    }
}