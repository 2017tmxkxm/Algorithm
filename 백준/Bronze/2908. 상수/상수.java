import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int temp1 = 0;
        int temp2 = 0;
        while(true) {
            temp1 = temp1 * 10 + A % 10;
            A /= 10;

            temp2 = temp2 * 10 + B % 10;
            B /= 10;

            if (A == 0 && B == 0) {
                break;
            }
        }

        System.out.println(Math.max(temp1, temp2));

    }
}