import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");

        long N = Long.parseLong(temp[0]);
        long M = Long.parseLong(temp[1]);

        System.out.println(Math.abs(N - M));
    }
}