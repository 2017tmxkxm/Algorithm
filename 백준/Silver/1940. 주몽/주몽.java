import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;
        int i = 0;  // A[0] -> MIN
        int j = N-1;    // A[N-1] -> MAX

        while(i<j) {
            if(A[i] +A[j] < M) i++;
            else if (A[i] + A[j] > M) j--;
            else {
                count ++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}