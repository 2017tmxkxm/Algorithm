import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = 31;
        int M = 1234567891;

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        char[] text = sc.next().toCharArray();

        long sum = 0;
        for(int i=0; i<L; i++) {
            long V = text[i] - 'a' + 1;
            long a = 1;
            for(int j=0; j<i; j++) {
                a = (a*r)%M;
            }
            long temp = (V*a)%M;
            sum += temp;
            sum %=M;
        }

        System.out.println(sum%M);
    }
}
