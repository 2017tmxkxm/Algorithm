import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 3;
        for(int i=2; i<=N; i++) {
            num = num * 2 -1;
        }
        System.out.println(num*num);
    }
}