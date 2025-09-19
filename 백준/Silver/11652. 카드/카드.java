import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] A = new long[N];
        for(int i=0; i<N; i++) {
            A[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(A);

        int MaxC = 1;
        int TempC = 1;
        long MaxV = A[0];
        for(int i=1; i<N; i++) {
            if(A[i]==A[i-1]) {
                TempC++;
            }else {
                TempC = 1;
            }
            if(MaxC < TempC) {
                MaxC = TempC;
                MaxV = A[i];
            }
        }
        System.out.println(MaxV);
    }
}
