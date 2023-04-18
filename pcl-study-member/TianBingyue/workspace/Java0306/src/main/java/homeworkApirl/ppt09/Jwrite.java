package homeworkApirl.ppt09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Jwrite {
    public static void main(String[] args){
        String str = "123456";
        byte[] buf = str.getBytes();
        File file = new File("D:/1.txt");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(buf);
            fos.close();
            System.out.println("写入成功");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
