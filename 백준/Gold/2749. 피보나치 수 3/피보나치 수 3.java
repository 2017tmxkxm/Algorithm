import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 피사노 주기
        int pisano = 1500000;

        long size = sc.nextLong()%pisano;

        long[] arr = new long[pisano];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<pisano; i++) {
            arr[i] = (arr[i-2] + arr[i-1]) % 1000000;
        }
        System.out.println(arr[(int)size]);
    }
}