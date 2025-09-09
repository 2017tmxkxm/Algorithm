import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int M = N;
        int S = 1;
        int sum = 0;
        for(int i=10; i<=N; i=i*10) {
            sum += (i-(i/10)) * S++;
            M -= (i - (i / 10));
        }
        sum += M*S;
        System.out.println(sum);

    }
}
