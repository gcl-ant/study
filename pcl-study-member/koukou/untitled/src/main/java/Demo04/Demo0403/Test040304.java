package Demo04.Demo0403;

import java.io.*;

public class Test040304 {
    //FileCopy
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("aaa.txt"));
        FileOutputStream fos = new FileOutputStream(new File("bbb.txt"));
        byte[] by = new byte[1024];
        int i = 0;
        while ((i = fis.read(by,0,by.length))!=-1){
            fos.write(by,0,i);
        }
    }
}
