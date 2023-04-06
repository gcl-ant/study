package day21;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

public class Test {
    public static void main(String[] args)  {
        File file = new File("./");
//        File file3 = new File();
        File file2= new File("C:\\Users\\gucanlin\\Desktop\\study-main\\gcl\\教案");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Writer
        System.out.println(file.exists());
    }
}
