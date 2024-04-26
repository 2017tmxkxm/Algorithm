import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] N = {a, b, c};

        Arrays.sort(N);
        System.out.println(N[0] + " " + N[1] + " " + N[2]);

    }
}