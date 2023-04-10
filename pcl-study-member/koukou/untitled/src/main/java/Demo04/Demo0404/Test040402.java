package Demo04.Demo0404;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class Test040402 {
    public static void main(String[] args) {
        String s = "abcdefg";
        try (
                ByteArrayInputStream bai = new ByteArrayInputStream(s.getBytes());
                PushbackInputStream pbi = new PushbackInputStream(bai,3);
        ) {
            int n;
            byte[] bytes = new byte[3];
            while ((n = pbi.read(bytes)) != -1) {
                System.out.println(new String(bytes));
                if ("abc".equals(new String(bytes))) {
                    pbi.unread(new byte[]{'x','y','x'});
                }
                bytes = new byte[3];
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
