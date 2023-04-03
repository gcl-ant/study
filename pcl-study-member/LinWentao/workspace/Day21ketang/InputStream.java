package Day21;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class InputStream {
    public static void main(String[] args) {
        try (
                FileInputStream fis1 = new FileInputStream("data.bin");
                DataInputStream dis1 = new DataInputStream(fis1);
        )
        {
            int myint= dis1.readInt();
            Double mydouble= dis1.readDouble();
            String red= dis1.readUTF();
            System.out.println(myint);
            System.out.println(mydouble+red);

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
