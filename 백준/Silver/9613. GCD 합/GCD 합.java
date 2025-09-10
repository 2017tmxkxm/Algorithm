import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            int N = sc.nextInt();
            int[] M = new int[N];
            for(int i=0; i<N; i++) {
                M[i] = sc.nextInt();
            }

            long sum = 0;
            for(int i=0; i<N-1; i++) {
                for(int j=i+1; j<N; j++) {
                    int a = M[i];
                    int b = M[j];
                    if(a < b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    sum += gcd2(a, b);
                }
            }

            System.out.println(sum);
        }
    }

    static int gcd2(int a, int b) {
        if(a%b==0) {
            return b;
        }else{
            return gcd2(b, a%b);
        }
    }
}
