import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String input  = br.readLine();
        int n1 = Integer.parseInt(input);
        System.out.println(n1 - 543);
    }
}