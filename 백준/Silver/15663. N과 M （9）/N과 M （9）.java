import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[] num;
    static int[] arr;
    static boolean[] visited;
    static LinkedHashSet<String> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        num = new int[N];
        arr = new int[M];
        visited = new boolean[N];
        set = new LinkedHashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        bfs(0);

        set.forEach(System.out::println);
    }

    private static void bfs(int depth) {
        if(depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            set.add(sb.toString());
            return;
        }

        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[depth] = num[i];
                bfs(depth+1);
                visited[i] = false;
            }

        }
    }
}