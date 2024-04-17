import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");
        int a = 0;
        int result = 0;
        for (int i=0; i<5; i++) {
            a = Integer.parseInt(A[i]);
            result += a * a;
        }

        System.out.println(result % 10);
    }
}