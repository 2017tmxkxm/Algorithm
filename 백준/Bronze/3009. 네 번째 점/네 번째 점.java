import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = sc.nextInt();
        int b = sc.nextInt();
        int b1 = sc.nextInt();
        int c = sc.nextInt();
        int c1 = sc.nextInt();

        int d;
        int d1;

        if(a != b && a !=c) {
            d = a;
        } else if (b != a) {
            d = b;
        } else {
            d = c;
        }

        if(a1 != b1 && a1 != c1) {
            d1 = a1;
        } else if (b1 != a1) {
            d1 = b1;
        } else {
            d1 = c1;
        }

        System.out.println(d + " " + d1);
    }
}