package day22;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class TestPushBackStream {
    public static void main(String[] args) {
        String s = "abcdefs";

        try (
                ByteArrayInputStream bai = new ByteArrayInputStream(s.getBytes());
                PushbackInputStream pbi = new PushbackInputStream(bai);
        ) {
            int n;
            while ((n = pbi.read()) != -1) {
                System.out.println((char) n);
                if ('b' == n) {
                    pbi.unread('X');
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
