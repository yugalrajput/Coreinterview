package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteLineByLine {
    public static void main(String[] args) throws IOException {
        // FileWriter fw = new FileWriter("D://faltu//filewriter.txt", true);
        BufferedWriter bw = new BufferedWriter(new FileWriter("D://faltu//filewriter.txt", true));

        char[] charArry = {'h', 'i'};

        bw.write(charArry);
        bw.write(',');
        bw.write("SunRays");

        System.out.println("Successfully........");


        bw.close();
        // fw.close();


    }
}
