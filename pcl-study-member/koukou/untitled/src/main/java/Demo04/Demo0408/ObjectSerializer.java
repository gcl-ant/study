package Demo04.Demo0408;

import java.io.*;

public class ObjectSerializer {
    public static void savaObj(Object obj, String fileName) throws IOException {
        ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(obj);
        oos.close();
    }

    public static Object loadObj(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}
