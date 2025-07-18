import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N+1][M+1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        //합배열
        int[][] S = new int[N+1][M+1];
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                S[i][j] = S[i-1][j] + S[i][j-1] + A[i][j] - S[i-1][j-1];
            }
        }

        int K = sc.nextInt();

        for(int i=0; i<K; i++) {
            int y1 = sc.nextInt();
            int x1 = sc.nextInt();
            int y2 = sc.nextInt();
            int x2 = sc.nextInt();
            int answer = S[y2][x2] - S[y2][x1-1] - S[y1-1][x2] + S[y1-1][x1-1];
            System.out.println(answer);
        }
    }
}
