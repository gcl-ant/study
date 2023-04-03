package day21;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try (
                FileOutputStream fos2 = new FileOutputStream("data.bin", true);
                DataOutputStream dos2 = new DataOutputStream(fos2);
        ) {
            dos2.writeInt(1001);
            dos2.writeDouble(3.1415926541);
            dos2.writeUTF("aaaaaaavbbbbbbc");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        try {
//            File file = new File("data.bin");
//            fos = new FileOutputStream(file, true);
//
//            dos = new DataOutputStream(fos);
//            dos.writeInt(100);
//            dos.writeDouble(3.141592654);
//            dos.writeUTF("aaaaaaavbbbbbb");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            if (dos != null) {
//                try {
//                    dos.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
    }
}
