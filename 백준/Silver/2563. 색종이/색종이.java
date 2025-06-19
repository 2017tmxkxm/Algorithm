import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int D[][] = new int[101][101];

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=0; t<N; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i=x; i<x+10; i++) {
                for(int j=y; j<y+10; j++) {
                    D[i][j] = 1;
                }
            }
        }

        int sum = 0;
        for(int i=1; i<=100; i++) {
            for(int j=1; j<=100; j++) {
                if(D[i][j] == 1) sum++;
            }
        }
        System.out.println(sum);
    }
}
