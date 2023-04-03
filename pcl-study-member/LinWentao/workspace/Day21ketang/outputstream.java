package Day21;

import java.io.*;

public class outputstream {
    public static void main(String[] args) {
 /*      File file1 = new File("C:\\Users\\Joy Lin\\Desktop\\day1.txt");
         PPT里的方法
 */
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            File file2 = new File("data.bin");
            fos = new FileOutputStream(file2,true);
            dos = new DataOutputStream(fos);
            dos.writeInt(100);
            dos.writeDouble(3.1415926);
            dos.writeUTF("Hello");


        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
            if(dos !=null)
                try {
                    dos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

        }




        }
    }

