import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==1 || n==3) {
            System.out.println(-1);
            return;
        }

        int cnt5 = n/5;
        n = n%5;
        if(n%2!=0) {
            cnt5--;
            n += 5;
        }
        int cnt2 = n/2;

        System.out.println(cnt2+cnt5);

    }
}
