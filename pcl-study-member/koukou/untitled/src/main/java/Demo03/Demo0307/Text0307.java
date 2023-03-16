package Demo03.Demo0307;

public class Text0307 {

    //private
    //public
    //默認
    //{} () [] "" '' 成對出現
    //方法 靜態 無返回值 主方法 (輸入參數類型 名字)
    public static void main(String[] args) {
        //類.類裡的屬性.屬性的方法(輸入的字符串)
        System.out.println("Hello Word");

        //Java類型
        //Steing[] 字符串類型
        //第一個部分 基本數據類型
        //數值型 整形:byte,short,int,long
        //      浮點型:double,flout
        // char (表示一個字符)
        // boolean (true false)
        //第二個部分 每個類型都限制字串
        //第三個部分 須設定默認值
        //第四個部分 類型可以變換
        //第五個部分 Java整數默認 int 小數默認 double

        //包裝類
        //byte = Byte
        //short = Short
        //int = Integer
        //long = Long
        //double = Double
        //float = Floay
        //char = Character
        //boolean =Boolean
        Byte byte1 = new Byte("1");//默認 0
        Short short1 = new Short("1");//默認 0
        Integer integer = new Integer(1);//默認 0
        Long long1 = new Long(1);//默認 0
        Double d11 = new Double(1.1);//默認 0.0
        Float f11 = new Float(1.1);//默認 0.0
        Character character = new Character('1');//默認 ''
        Boolean b1 = new Boolean("true");//默認 false

        System.out.println("--------------------");
        byte b = 127;
        int i = 2;
        double d = -1.1;
        System.out.println( b - i + d );

        Integer intenger = new Integer(1);

        String s1=new String("A");
        String s2=new String("A");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
