import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int set = Integer.MAX_VALUE;
        int each = Integer.MAX_VALUE;
        for(int i=0; i<M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            set = Math.min(A, set);
            each = Math.min(B, each);
        }

        //세트로 다 사는 경우
        int setAll = (N/6 + 1) * set;

        //낱개로 다 사는 경우
        int eachAll = each * N;

        //혼합해서 사는 경우
        int mix = (N/6)*set + (N%6)*each;

        System.out.println(Math.min(mix,Math.min(setAll, eachAll)));

    }
}
