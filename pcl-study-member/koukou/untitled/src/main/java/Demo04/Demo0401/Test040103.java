package Demo04.Demo0401;

public class Test040103 {
    public static void main(String[] args) {

//        異常處理 try & catch
//        try{
//            int x=100;
//            int y=10;
//            System.out.println("x/y="+x/y);
//        }catch(ArithmeticException e){
//            System.out.println("发生了数学异常，注意除数不能为0.");
//        }
//        System.out.println("main方法运行结束");

//        查看异常发生的栈轨迹 printStackTrace()
//        try{
//            int x=100;
//            int y=0;
//            System.out.println("x/y="+x/y);
//        }catch(ArithmeticException e){
//            e.printStackTrace(); //查看异常发生的栈轨迹
//            System.out.println("发生了数学异常，注意除数不能为0.");
//        }
//        System.out.println("main方法运行结束");

//        使用多個 try & catch
//        try{
//            int x=100;
//            int y=0;
//            String s=null;
//            System.out.println("x/y="+x/y);
//            System.out.println("字符串长度"+s.length());
//        }catch(ArithmeticException e){
//            System.out.println("发生了数学异常，注意除数不能为0.");
//        }catch(NullPointerException e){
//            System.out.println("发生了空指针异常");
//        }catch(Exception e){
//            System.out.println("发生了其他异常");
//        }
//        System.out.println("main方法运行结束");

//        finally & return
//        try{
//            int x=100;
//            int y=0;
//            System.out.println("x/y="+x/y);
//        }catch(ArithmeticException e){
//            System.out.println("发生了数学异常，注意除数不能为0.");
//            return;
//        }finally{
//            System.out.println("finally代码块");
//        }
//        System.out.println("main方法运行结束");

//        finally & System.exit(0)
//        try{
//            int x=100;
//            int y=0;
//            System.out.println("x/y="+x/y);
//        }catch(ArithmeticException e){
//            System.out.println("发生了数学异常，注意除数不能为0.");
//            System.exit(0);
//        }finally{
//            System.out.println("finally代码块");
//        }
//        System.out.println("main方法运行结束");

//        Calculator01 cal01 = new Calculator01();
//        try{
//            cal01.div(10,0);
//        }catch (Exception e){
//            System.out.println("除数不能为0");
//        }

        Calculator02 cal02 = new Calculator02();
        try{
            cal02.div(10,0);
        }catch (Exception e){
            System.out.println("除数不能为0");
        }

    }
}
class Calculator01 {
    public void div(int x,int y) throws Exception{
        //当除数为0时，抛出异常
        //使用throws后，不再有编译错误
        if( y == 0 ){
            throw new Exception();
        }
        System.out.println("x/y="+x/y);
    }
}
class Calculator02 {
    public void div(int x,int y) throws Exception{
        try{
            if( y == 0 ){
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("除数不能为0");
            throw e;
        }finally{
            System.out.println("finally代码块");
        }
        System.out.println("x/y="+x/y);
    }
}
