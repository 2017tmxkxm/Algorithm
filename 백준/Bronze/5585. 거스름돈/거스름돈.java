import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        int[] arr = {500, 100, 50, 10, 5, 1};

        int change = 1000 - money;

        int count = 0;

        for(int i=0; i<arr.length; i++) {
            count += change / arr[i];
            change = change % arr[i];
        }

        System.out.println(count);

    }
}
