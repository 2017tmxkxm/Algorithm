import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i<tc; i++) {
            String[] inputs = br.readLine().split(" ");
            int sum = Arrays.stream(inputs).mapToInt(Integer::parseInt).sum();
            System.out.println(sum);
        }
    }
}