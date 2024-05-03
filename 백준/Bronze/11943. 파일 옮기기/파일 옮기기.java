import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] frist = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        int A = Integer.parseInt(frist[0]);
        int B = Integer.parseInt(frist[1]);
        int C = Integer.parseInt(second[0]);
        int D = Integer.parseInt(second[1]);

        System.out.println(Math.min(A+D, B+C));
    }
}