import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = N/5;
        N %= 5;

        if(N==0) {
            System.out.println(count);
            return;
        }
        for(int i=0; i<3 && count-i>=0; i++) {
            int temp = N + 5*i;
            if(temp%3==0) {
                count-=i;
                count += temp/3;
                System.out.println(count);
                return;
            }
        }
        System.out.println(-1);
    }
}
