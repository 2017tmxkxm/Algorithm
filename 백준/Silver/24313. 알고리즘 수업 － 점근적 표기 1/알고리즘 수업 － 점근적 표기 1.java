import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        
        boolean check = true;
        for(int n=n0; n<=100; n++) {
            if(a1*n + a0 > c*n) {
                check = false;
            }
        }
        if(check) System.out.println(1);
        else System.out.println(0);
    }
}
