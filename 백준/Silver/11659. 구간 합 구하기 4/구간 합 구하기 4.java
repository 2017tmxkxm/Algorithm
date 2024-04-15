import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int nCnt = Integer.parseInt(st.nextToken());
        int qCnt = Integer.parseInt(st.nextToken());
        long[] sum = new long[nCnt + 1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=nCnt; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int q=0; q<qCnt; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sum[j] - sum[i-1]);
        }

    }
}