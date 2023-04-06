package day22;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("C:\\Users\\gucanlin\\Desktop\\study-main\\gcl\\教案");
                DataInputStream inputStream = new DataInputStream(fis)){
            byte[] byteArr = new byte[1024];

            inputStream.read(byteArr,1,20000);


            inputStream.skip(10);
            inputStream.read(byteArr);
            inputStream.close();

        }catch (Exception ex){

        }
    }
}
