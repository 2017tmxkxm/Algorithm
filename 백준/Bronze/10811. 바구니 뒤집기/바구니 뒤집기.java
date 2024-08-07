import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        for(int i=1; i<=N; i++) {
            arr[i] = i;
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int[] temp = new int[e-s+1];
            int index = 0;
            for(int j=e; j>=s; j--) {
                temp[index++] = arr[j];
            }

            index = 0;
            for(int j=s; j<=e; j++) {
                arr[j] = temp[index++];
            }
        }

        for(int i=1; i<=N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}