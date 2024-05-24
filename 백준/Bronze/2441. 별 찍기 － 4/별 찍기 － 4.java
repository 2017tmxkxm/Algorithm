import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i>0; i--) {
            for(int k=n; k>i; k--) {
                System.out.print(" ");
            }
            for(int j=i-1; j>=0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}