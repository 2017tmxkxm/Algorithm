import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] A = br.readLine().split(" ");

        BigInteger num1 = new BigInteger(A[0]);
        BigInteger num2 = new BigInteger(A[1]);

        System.out.println(num1.add(num2));
    }
}