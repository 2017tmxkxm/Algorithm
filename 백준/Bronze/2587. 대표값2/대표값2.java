import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[6];
        int sum = 0;

        for(int i=1; i<=5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=5; i++) {
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[3]);
    }
}