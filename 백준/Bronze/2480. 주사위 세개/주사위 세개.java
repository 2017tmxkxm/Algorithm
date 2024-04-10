import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int num1 = Integer.parseInt(inputs[0]);
        int num2 = Integer.parseInt(inputs[1]);
        int num3 = Integer.parseInt(inputs[2]);

        if (num1 == num2 && num2 == num3) {
            System.out.println(10000 + (num1 * 1000));
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            if (num1 == num2) {
                System.out.println(1000 + (num1 * 100));
            } else if (num2 == num3) {
                System.out.println(1000 + (num2 * 100));
            } else {
                System.out.println(1000 + (num1 * 100));
            }
        } else {
            System.out.println(Stream.of(inputs).mapToInt(Integer::parseInt).max().getAsInt() * 100);
        }
    }
}