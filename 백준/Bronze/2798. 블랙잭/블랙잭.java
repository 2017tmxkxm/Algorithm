import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] A;
    static int[] arr;
    static int sum = 0;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        arr = new int[3];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(sum);
    }

    private static void dfs(int depth) {
        int temp = 0;
        if(depth == 3) {
            for(int val : arr) {
               temp += val;
            }
            if(temp <= M) {
                sum = Math.max(sum, temp);
            }
            return;
        }

        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[depth] = A[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}