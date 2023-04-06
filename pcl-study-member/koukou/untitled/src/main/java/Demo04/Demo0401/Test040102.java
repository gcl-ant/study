package Demo04.Demo0401;

public class Test040102 extends RuntimeException{
//    模拟实现用户购买商品的功能，使用数组模拟商品列表，当购买的商品不存在或者商品库存为0时，抛出自定义异常。用户购买某一个商品时，对异常进行处理，并对库存进行改变。
//    考点：自定义异常、异常处理、throw/throws关键字
    public Test040102(String message){
        super(message);
    }
}
class test{
    private String name;
    private int stock;
    public test(String name,int stock){
        this.name = name;
        this.stock = stock;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
class store{
    private test[] tests;
    public store(test[] tests){
        this.tests = tests;
    }
    public void buy(String name) throws Test040102 {
        for (test test : tests) {
            if (test.getName().equals(name)) {
                if (test.getStock() > 0) {
                    System.out.println("购买成功，商品名称：" + name);
                    test.setStock(test.getStock() - 1);
                    return;
                } else {
                    throw new Production("商品已售罄，商品名称：" + name);
                }
            }
        }
        throw new Production("商品不存在，商品名称：" + name);
    }
}
class xxx{
    public static void main(String[] args) {
        test[]  tests = new test[3];
        tests[0] = new test("商品1",2);
        tests[1] = new test("商品2",0);
        tests[2] = new test("商品2",3);

        store store  = new store(tests);
        //  store.buyProduct("商品1");
        //            store.buyProduct("商品3");
        //            store.buyProduct("商品4");
        //            store.buyProduct("");
        try{
            store.buy("商品2");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buy("商品1");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buy("商品3");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buy("商品4");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try{
            store.buy("");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}