package day21;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test3 {
    public static void main(String[] args) {

        try (
                FileInputStream fis2 = new FileInputStream("data.bin");
                DataInputStream dis2 = new DataInputStream(fis2);
        ) {
            int myint = dis2.readInt();
            double mydouble = dis2.readDouble();
            String str = dis2.readUTF();

            System.out.println(mydouble + myint + str);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
