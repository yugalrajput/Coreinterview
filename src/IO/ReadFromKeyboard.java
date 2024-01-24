package IO;

import java.io.*;

//program for read data from keyboard and write into text file
public class ReadFromKeyboard {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D://faltu//keyboard.txt");
        PrintWriter pw = new PrintWriter(fw);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String s = br.readLine();

        while (!s.equals("quit")) {
            pw.write(s);
            s = br.readLine();
        }
        br.close();
        pw.close();
        System.out.println(" Check your file ");
    }

}
