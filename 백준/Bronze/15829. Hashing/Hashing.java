import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] str = sc.next().toCharArray();

        int result = 0;

        for(int i=0; i<n; i++) {
            int temp = (int) Math.pow(31, i);
            result += (str[i] - 96) * temp;
        }

        System.out.println(result);
    }
}