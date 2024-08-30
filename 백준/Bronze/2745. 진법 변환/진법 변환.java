import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        int N = sc.nextInt();
        int[] A = new int[text.length];
        for(int i=0; i<text.length; i++) {
            // text[i]가 0과 9 사이일 경우
            if(47 < text[i] && text[i] < 58) {
                A[i] = Integer.parseInt(String.valueOf(text[i]));
            }else {
                // text[i]가 A(65)일 경우 - 55 = 문제에서의 A(10)
                A[i] = text[i] - 55;
            }
        }

        int result = A[A.length - 1];
        int temp = N;
        for(int i=A.length-2; i>=0; i--) {
            result += A[i] * temp;
            temp = temp * N;
        }

        System.out.println(result);
    }
}
