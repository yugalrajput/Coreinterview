package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFromOneToAnotherFile {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D://faltu//copydata.txt");
        FileOutputStream fos = new FileOutputStream("D://faltu//copydata1.txt");

        int i;
        while ((i = fis.read()) != -1) {
            fos.write((char) i);
        }
        System.out.println("Completed...");


    }
}
