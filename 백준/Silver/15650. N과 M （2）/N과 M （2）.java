import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int num[];
    static StringBuilder sb = new StringBuilder();
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        num = new int[M];

        BackTracking(1, 0);

        System.out.println(sb);
    }

    private static void BackTracking(int at, int depth) {
        if(depth == M) {
            for(int val : num) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=at; i<=N; i++) {
            num[depth] = i;
            BackTracking(i+1, depth+1);
        }
    }
}