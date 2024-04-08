import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        long n1 = Long.parseLong(inputs[0]);
        long n2 = Long.parseLong(inputs[1]);
        long n3 = Long.parseLong(inputs[2]);

        wr.write(n1 + n2 + n3 + "\n");

        wr.flush();
        wr.close();
    }
}