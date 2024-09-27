import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[1000001];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<n+1; i++) {
            arr[i] = (arr[i-2] + arr[i-1])%1000000007;
        }

        System.out.println(arr[n]);
    }
}