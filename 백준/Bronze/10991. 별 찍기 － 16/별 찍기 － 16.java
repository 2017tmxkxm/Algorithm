import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<N+1; i++) {
            for(int j=0; j<N+i-1; j++) {
                if((i+j+N)%2 == 0 && j>=N-i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
