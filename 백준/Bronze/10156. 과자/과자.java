import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");

        int K = Integer.parseInt(A[0]);
        int N = Integer.parseInt(A[1]);
        int M = Integer.parseInt(A[2]);

        int temp = M - (K * N);

        if (temp > 0) {
            System.out.println("0");
        } else {
            System.out.println(Math.abs(temp));
        }

    }
}