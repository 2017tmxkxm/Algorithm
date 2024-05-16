import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextInt();
        double d2 = sc.nextInt();
        double pie = 3.141592;

        System.out.println(((d2 * 2) * pie) + (d1 * 2));
    }
}