import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);
        int n3 = Integer.parseInt(input[2]);

        wr.write((n1 +n2)%n3 + "\n");
        wr.write(((n1%n3) + (n2%n3))%n3 + "\n");
        wr.write((n1*n2)%n3 + "\n");
        wr.write(((n1%n3) * (n2%n3))%n3 + "\n");

        wr.flush();
        wr.close();
    }
}