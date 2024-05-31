import java.util.Scanner;

class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[10][10];
        int max = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;

        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                A[i][j] = sc.nextInt();
                if(A[i][j] > max) {
                    max = A[i][j];
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(a + " " + b);
    }
}