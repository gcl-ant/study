package Demo04.Demo0404;

import java.io.*;

public class Test040403 {
    public static void main(String[] args) throws Exception{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeInt(100);
            dos.writeDouble(3.141592654);
            dos.writeUTF("abc");
            byte[] b = baos.toByteArray();
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
            System.out.println(dis.readInt() + "\t" + dis.readDouble() +  "\t" + dis.readUTF());
    }
}