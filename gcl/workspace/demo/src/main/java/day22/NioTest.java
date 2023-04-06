package day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class NioTest {
    public static void main(String[] args) {
        String filePathIn = "";
        String filePathOut = "";

        try (
                FileInputStream fis = new FileInputStream(filePathIn);
                FileOutputStream fos = new FileOutputStream(filePathOut);
                FileChannel fisChannelIn = fis.getChannel();
                FileChannel fosChannelOut = fos.getChannel();
        ) {
            fisChannelIn.transferTo(0, fosChannelOut.size(), fosChannelOut);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
