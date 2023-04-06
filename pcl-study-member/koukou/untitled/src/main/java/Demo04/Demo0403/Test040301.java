package Demo04.Demo0403;

import java.io.*;
public class Test040301 {
    // boolean exists()
    //判断文件是否存在，存在返回true，否则返回false
    //boolean isFile()
    //判断是否为文件，是文件返回true，否则返回false
    //boolean isDirectory()
    //判断是否为目录，是目录返回true，否则返回false
    //String getName()
    //获得文件的名称
    //String getAbsolutePath()
    //获得文件的绝对路径
    //long length()
    //获得文件的长度（字节数）
    //boolean createNewFile() throws IOException
    //创建新文件，创建成功返回true，否则返回false，有可能抛出IOException异常，必须捕捉
    //boolean delete()
    //删除文件，删除成功返回true，否则返回false
    //File[] listFiles()
    //返回文件夹内的子文件与子文件夹的数组
    public static void main(String[] args) throws IOException{
        File file = new File("./aaa.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        try{
            file.createNewFile();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}