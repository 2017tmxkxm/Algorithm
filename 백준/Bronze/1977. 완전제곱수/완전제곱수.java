import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        int small = 0;

        for(int i=M; i<=N; i++) {
            int per = (int) Math.sqrt(i);
            if (per*per == i) {
                sum += i;
                cnt++;
                if(cnt==1) {
                    small = i;
                }
            }
        }

        if(cnt ==0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(small);
        }
        
    }
}