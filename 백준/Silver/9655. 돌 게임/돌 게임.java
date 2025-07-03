import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D[] = new int[1001];

        //상근 = 1, 창영 = 0
        D[1] = 1;
        D[2] = 0;
        D[3] = 1;

        //D[N] 일 때 승자를 알고 싶다면, D[N-1] or D[N-3] 승자와 반대 사람이 이긴다.
        for(int i=4; i<=N; i++) {
            if(D[i-1]==1 || D[i-3]==1) {
                D[i] = 0;
            } else {
                D[i] = 1;
            }
        }
        
        if(D[N]==1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }

    }

}
