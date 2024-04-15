import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        for(int i=0; i<N; i++) {
            int temp = sc.nextInt();
            if (temp < X) {
                System.out.print(temp + " ");
            }
        }
    }
}