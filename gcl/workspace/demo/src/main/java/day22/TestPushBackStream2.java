package day22;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class TestPushBackStream2 {
    public static void main(String[] args) {

        /**
         * abc
         *
         * XYZdefg  "","",""
         *
         * XYZ
         *
         * def
         *
         * g
         *
         */
        String s = "abcdefg";
        try (
                ByteArrayInputStream bai = new ByteArrayInputStream(s.getBytes());
                PushbackInputStream pbi = new PushbackInputStream(bai,3);
        ) {
            int n;
            byte[] bytes = new byte[3];
            while ((n = pbi.read(bytes)) != -1) {
                System.out.println("before " + new String(bytes));
                if ("abc".equals(new String(bytes))) {
                    pbi.unread(new byte[]{'X','Y','Z'});
                }
                bytes = new byte[3];
//                System.out.println("after" + new String(bytes));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
