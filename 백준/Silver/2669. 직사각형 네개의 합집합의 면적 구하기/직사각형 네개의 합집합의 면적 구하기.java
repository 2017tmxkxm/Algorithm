import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[101][101];

        for(int i=0; i<4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int x=x1; x<x2; x++) {
                for(int y=y1; y<y2; y++) {
                    A[x][y] = 1;
                }
            }
        }

        int sum = 0;

        for(int i=1; i<101; i++) {
            for(int j=1; j<101; j++) {
               if(A[i][j] == 1) sum++;
            }
        }

        System.out.println(sum);
    }
}
