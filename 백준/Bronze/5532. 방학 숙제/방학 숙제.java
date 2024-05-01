import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        double A = sc.nextInt();
        double B = sc.nextInt();
        double C = sc.nextInt();
        double D = sc.nextInt();

        int day1 = (int) Math.ceil(A/C);
        int day2 = (int) Math.ceil(B/D);

        if (day1 >= day2) {
            System.out.println(L - day1);
        } else {
            System.out.println(L - day2);
        }

    }
}