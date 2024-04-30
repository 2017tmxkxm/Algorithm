import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int sum = a1 + a2 + a3;

        if (a1 == 60 && a2 == 60 && a3 == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180 && a1 == a2 || a2 == a3 || a1 == a3) {
            System.out.println("Isosceles");
        } else if (sum == 180) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}