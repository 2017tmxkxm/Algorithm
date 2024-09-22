import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0) {
            System.out.println(0);
        } else if(n==1) {
            System.out.println(1);
        } else {
            // n이 17일 경우 0부터 17까지의 배열을 생성
            BigInteger[] arr = new BigInteger[n+1];

            arr[0] = BigInteger.ZERO;
            arr[1] = BigInteger.ONE;

            for(int i=2; i<=n; i++) {
                arr[i] = arr[i-2].add(arr[i-1]);
            }

            System.out.println(arr[n]);
        }
    }
}