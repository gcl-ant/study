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

    }
}
