import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int count = 0;
        while(A!=B) {
            count++;
            A = (A+1)/2;
            B = (B+1)/2;
        }
        System.out.println(count);
    }
}
