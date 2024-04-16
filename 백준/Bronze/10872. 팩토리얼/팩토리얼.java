import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int num = Integer.parseInt(input);

        int sum = 1;

        for(int i=1; i<=num; i++) {
            sum *= i;
        }

        System.out.println(sum);
    }
}