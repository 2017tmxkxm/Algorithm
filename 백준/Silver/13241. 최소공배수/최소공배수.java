import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 최소공배수 = A*B/최대공약수
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        if(A<B) {
            long temp = B;
            B = A;
            A = temp;
        }
        System.out.println(A*B/gcd(A,B));
    }

    private static long gcd(long a, long b) {
        if(a%b==0) return b; //a가 b로 나누어 떨어지면서 b가 최대 공약수
        return gcd(b, a % b);
    }
}
