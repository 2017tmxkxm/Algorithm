import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for(int i=1; i<n; i++) {
            if(n == check(i)) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    private static int check(int now) {
        int sum = now;
        char[] text = String.valueOf(sum).toCharArray();
        for(int i=0; i< text.length; i++) {
            sum += Integer.parseInt(String.valueOf(text[i]));
        }
        return sum;
    }
}