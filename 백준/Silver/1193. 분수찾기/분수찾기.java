import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int X = 1;
        int Y = 1;
        int dir = -1;

        while(count<N) {
            if(X==1 && dir==-1) {
                Y++;
                dir = 1;
            } else if(Y==1 && dir==1) {
                X++;
                dir = -1;
            } else if (dir==1) {
                X++;
                Y--;
            } else {
                X--;
                Y++;
            }
            count++;
        }
        System.out.println(X +"/" + Y);
    }
}
