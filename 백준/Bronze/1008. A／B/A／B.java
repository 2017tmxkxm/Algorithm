import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        double n1 = Integer.parseInt(input[0]);
        double n2 = Integer.parseInt(input[1]);

        System.out.println(n1 / n2);

    }
}