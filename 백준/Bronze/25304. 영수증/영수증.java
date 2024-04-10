import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());

        int all = Integer.parseInt(br.readLine());

        for (int i = 0; i < all; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            sum -= price * count;
        }

        if (sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}