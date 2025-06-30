import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        int i = 1;

        int N = Integer.MIN_VALUE;

        while(S>0) {
            S-=i;
            if(N < i && S>=0) {
                N = i;
            }
            i++;
        }

        System.out.println(N);
    }
}
