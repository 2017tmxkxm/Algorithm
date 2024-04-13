import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int M = 0;
        int sum = 0;

        for (int i=0; i<N; i++) {
            int temp = sc.nextInt();
            if (M < temp) {
                M = temp;
            }
            sum += temp;
        }

        System.out.println(sum * 100.0/M/N);
    }
}