package IO;

import java.io.*;

public class EmailReadWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D://faltu//mail.txt"));

        FileWriter fw = new FileWriter("D://faltu//mailWrite.txt");
        PrintWriter pw = new PrintWriter(fw);
        String s = br.readLine();

        while (s != null) {
            if (s.endsWith("@gmail.com")) {
                pw.println(s);
                System.out.println(s);
            }
            s = br.readLine();
        }

        pw.close();


    }
}
