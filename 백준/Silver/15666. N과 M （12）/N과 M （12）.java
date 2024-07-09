import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] num;
    static int[] arr;
    static LinkedHashSet<String> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        num = new int[N];
        arr = new int[M];
        set = new LinkedHashSet();
        // 데이터 삽입
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 데이터 오름차순 정렬
        Arrays.sort(num);

        // dfs 함수
        dfs(0,0);
        set.forEach(System.out::println);
    }

    private static void dfs(int start, int depth) {
        StringBuilder sb = new StringBuilder();
        if(depth == M) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            set.add(sb.toString());
            return;
        }

        for(int i=start; i<N; i++) {
            arr[depth] = num[i];
            dfs(i, depth+1);
        }
    }
}