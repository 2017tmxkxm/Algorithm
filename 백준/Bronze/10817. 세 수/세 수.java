import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static long ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split(" ");
        int[] A = new int[3];
        for(int i=0; i<N.length; i++) {
            A[i] = Integer.parseInt(N[i]);
        }
        Arrays.sort(A);
        System.out.println(A[1]);
    }
}