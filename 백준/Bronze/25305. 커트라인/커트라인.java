import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] xs = new int[n+1];

        for(int i=1; i<=n; i++) {
            xs[i] = sc.nextInt();
        }

        Arrays.sort(xs);

        System.out.println(xs[xs.length-k]);
    }
}
