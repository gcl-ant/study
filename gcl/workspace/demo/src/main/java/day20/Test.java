package day20;

import java.io.*;

public class Test {
    public static void main(String[] args) {
//        try{
//
//        }catch (Exception ex){
//
//        }

//        try {
//            System.out.println(100 / 10);
////            FileReader fileReader = new FileReader(new File("xxxxxxxxxx"));
////            FileReader fileReader2 = new FileReader(new File("xxxxxxxxxx"));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("aaa");
//        }
        //1.7 try with resource

//        File soranFile = new File("C:\\Users\\gucanlin\\Desktop\\study-main\\riku\\readme.md.txt");
//        /** try catch with resourceで書いた場合*/
//        try(FileWriter filewriter = new FileWriter(soranFile)) {
//            System.out.println("ソーラン節作成完了");
//        } catch(IOException e) {
//            System.out.println(e);
//        }
//
//
//        FileWriter filewriter2 = null;
//        try{
//            filewriter2 = new FileWriter(soranFile);
//            System.out.println("ソーラン節作成完了");
//        } catch(IOException e) {
//            System.out.println(e);
//        } finally {
//            if (Objects.nonNull(filewriter2)){
//                try {
//                    filewriter2.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

//        try{
//            int x=100;
//            int y=0;
//
//            System.out.println("x/y="+x/y);
//
//            System.out.println("x/y计算结束");
//
//        }catch(Exception e){
//
//            System.out.println("发生了数学异常，注意除数不能为0.");
//        }
//
//        System.out.println("main方法运行结束");

//        try {
//            int x = 100;
//            int y = 10;
//            System.out.println("x/y=" + x / y);
//            System.out.println("x/y计算结束");
//        } finally {
//            System.out.println("finally代码块");
//        }
//        System.out.println("main方法运行结束");


//        try {
//            print();
//        } catch (ExceptionDemo e) {
//            throw new RuntimeException(e);
//        }

//        assert 1==1:"aaaaa";

        Product[]  products = new Product[3];
        products[0] = new Product("商品1",2);
        products[1] = new Product("商品2",0);
        products[2] = new Product("商品2",3);

        Store store  = new Store(products);
        //  store.buyProduct("商品1");
        //            store.buyProduct("商品3");
        //            store.buyProduct("商品4");
        //            store.buyProduct("");

//        aaaa
        try{
            store.buyProductOld("商品2");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buyProductOld("商品1");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buyProductOld("商品3");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buyProductOld("商品4");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buyProductOld("");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }

//    private static void print() throws IOException, ExceptionDemo {
//        FileWriter filewriter2 = new FileWriter("");
//    }


}
