package day19;

public class FunctionBindOp2 {
    public void foo(){
        System.out.println("绑定的成员方法");
    }

    public static void main(String[] args) {
        FunctionBindOp2 fBindOp2=new FunctionBindOp2();
        IBFoo ifoo = fBindOp2::foo;
        ifoo.ifoo();
    }
}

