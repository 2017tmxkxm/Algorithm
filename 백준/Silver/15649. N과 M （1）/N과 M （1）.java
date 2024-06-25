import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int num[];
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();
    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        num = new int[M];
        visited = new boolean[N];

        BackTracking(0);
        System.out.println(sb);
    }

    private static void BackTracking(int depth) {
        if(depth == M) {
            for(int val : num) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                num[depth] = i+1;
                BackTracking(depth+1);
                visited[i] = false;
            }
        }
    }
}