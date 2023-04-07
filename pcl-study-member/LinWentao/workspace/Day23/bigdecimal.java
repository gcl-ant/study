package Day23;
import java.math.BigDecimal;
public class bigdecimal {
    public static void main(String[] args) {

    //使用BigDecimal类型进行运算
    BigDecimal a = new BigDecimal("3.14");
    BigDecimal b = new BigDecimal("3.1455");

    // 加法运算
    BigDecimal c = a.add(b);
        System.out.println(c);

    // 减法运算
    BigDecimal d = b.subtract(a);
        System.out.println(d);

    // 乘法运算
    BigDecimal e=a.multiply(b);
        System.out.println(e);

    //除法运算  BigDecimal

    //BigDecimal f = b.divide(a);  报错Non-terminating decimal expansion; no exact representable decimal result.
    BigDecimal f = b.divide(a,2,1);// 除数，小数位数，取舍规则
        System.out.println(f);
    }
}
