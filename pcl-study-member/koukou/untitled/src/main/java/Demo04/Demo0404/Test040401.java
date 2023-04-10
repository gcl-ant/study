package Demo04.Demo0404;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class Test040401 {
    public static void main(String[] args) {
        String s = "abcdef";
        try (
                ByteArrayInputStream bai = new ByteArrayInputStream(s.getBytes());
                PushbackInputStream pbi = new PushbackInputStream(bai);
        ) {
            int n;
            while ((n = pbi.read()) != -1) {
                System.out.println((char) n);
                if ('c' == n) {
                    pbi.unread('x');
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
