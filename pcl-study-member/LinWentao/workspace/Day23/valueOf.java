package Day23;

public class valueOf {
    public static void main(String[] args) {

        boolean b = true;
        char c = 'a';
        char[] data = {'h', 'e', 'l', 'l', 'o'};
        double d = 3.14159;
        float f = 3.141592f;
        int i = 42;
        long l = 12345678;
        Object obj = new Object();

        String str1 = String.valueOf(b); //将布尔类型参数以字符串类型返回
        String str2 = String.valueOf(c);
        String str3 = String.valueOf(data);
        String str4 = String.valueOf(data, 0, 2);
        String str5 = String.valueOf(d);
        String str6 = String.valueOf(f);
        String str7 = String.valueOf(i);
        String str8 = String.valueOf(l);
        String str9 = String.valueOf(obj);

    }
}
