import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        if (num1 * num2 > 0) {
            if (num1 > 0) {
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        } else {
            if (0 > num1) {
                System.out.println(2);
            } else {
                System.out.println(4);
            }
        }
    }
}