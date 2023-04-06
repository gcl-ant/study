//package day21;
//
//import sun.util.locale.provider.DateFormatProviderImpl;
//
//import java.io.*;
//
//public class FileWithDateOutputStreamTest {
//    public static void main(String[] args){
//        FileOutputStream fos = null;
//        DateOutputStream dos = null;
//        try {
//            File file = new File("date.aline");
//            fos = new  FileOutputStream(file,true);
//            dos = new DateOutputStream(fos);
//            dos.writeInt(100);
//            dos.writeDouble(3.1415926);
//            dos.writeUTF("Hello!");
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }finally {
//            if (dos != null)
//                try{
//                dos.close();
//        }catch (IOException e){
//                    e.printStackTrace();
//                }
//    }
//    }
//
//
//    public static void main(String[] args)  {
////        FileInputStream fis = new FileInputStream ("date.aline");
////        DateInputStream dis = new DateInputStream(fis);
//        try(
//                FileInputStream fis = new FileInputStream ("date.aline");
//                DateInputStream dis = new DateInputStream(fis);
//                ){
////          fis = new FileInputStream ("date.aline");
////          dis = new DateInputStream(fis);
//          System.out.println(dis.readInt()+"\t"+dis.readDouble()+"\t"+dis.readUTF());
//        }catch(Exception ex){
//        }finally {
//            if (dis != null)
//                try{
//                    dis.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//        }
//        if (fis != null)
//            try{
//                fis.close();
//            }catch (IOException e){
//                e.printStackTrace();
//    }
//    }
//}
//
