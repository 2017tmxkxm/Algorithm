import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=0; i<N; i++) {
            int temp = sc.nextInt();

            // 소수인 경우 true, 아닌 경우 false
            boolean isTrue = true;
            if(temp == 1) isTrue = false;
            else {
                for(int j=2; j<=Math.sqrt(temp); j++) {
                    if(temp%j==0) {
                        isTrue = false;
                        break;
                    }
                }
            }
            if(isTrue) count++;
        }
        System.out.println(count);
    }
}