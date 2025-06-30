import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        if(E==15) E=0;
        int S = sc.nextInt();
        if(S==28) S=0;
        int M = sc.nextInt();
        if(M==19) M=0;
        int V = 1;

        while(true) {
            if(V%15==E && V%28==S && V%19==M) {
                break;
            }
            V++;
        }

        System.out.println(V);
    }
}
