package org.demo0307;

public class homework0307 {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 10000;
        long l = 32767;
        float f = 0.4f;
        double d = 0.4d;
        char c = 'A';
        boolean bn = true;
        System.out.println("byte = "+(b));
        System.out.println("short = "+(s));
        System.out.println("int = "+(i));
        System.out.println("long = "+(l));
        System.out.println("float = "+(f));
        System.out.println("double = "+(d));
        System.out.println("char = "+(c));
        System.out.println("boolean = "+(bn));

        Byte byte1 = new Byte("127");
        Short short1 = new Short("32767");
        Integer integer1 = new Integer(10000);
        Integer integer2 = new Integer(10000);
        Long long1 = new Long(32767);
        Float float1 = new Float(0.5);
        Double double1 = new Double(0.5);
        Character character1 = new Character('A');
        Boolean boolean1 = new Boolean("true");
//        不同類型的包裝無法比較，反之可以
//        System.out.println( integer1 == integer2 );
//        無法成功
//        System.out.println( byte1 == integer2 );

        System.out.println("short==long = "+(s == l));
        System.out.println("float!=double = "+(f != d));//0.5,0.25,0.125,0.0625,0.03125 OK
        System.out.println("short==long = "+(s <= l));

        String string1=new String("A");
        String string2=new String("A");
        String string3=new String("B");
        //找尋位址
        System.out.println(System.identityHashCode(string1));
        System.out.println(System.identityHashCode(string2));
        System.out.println(System.identityHashCode(string3));
        //位址不同
        System.out.println(string1 == string2);
        System.out.println(string1 != string3);
        System.out.println(string2 == string3);
        //值相同
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));
        System.out.println(string2.equals(string3));
    }
}
