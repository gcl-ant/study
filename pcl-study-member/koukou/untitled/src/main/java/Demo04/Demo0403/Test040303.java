package Demo04.Demo0403;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test040303 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("aaa.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readInt() + "\t" + dis.readDouble() +  "\t" + dis.readUTF());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}