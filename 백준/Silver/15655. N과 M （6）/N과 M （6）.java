import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    // 변수
    static int N, M;
    // 입력 받은 숫자 배열
    static int num[];
    // 출력할 숫자 배열
    static int arr[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        num = new int[N];
        arr = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 입력 받은 숫자 배열 오름차순으로 정렬
        Arrays.sort(num);

        // backTracking 함수 (시작위치, 깊이)
        backTracking(0, 0);

        System.out.println(sb);
    }

    public static void backTracking(int start, int depth) {
        // depth 체크 > true > sb.append
        if(depth == M) {
            for(int i=0; i<M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // arr[]에 조건에 맞춰 담기
        for(int i=start; i<N; i++) {
            arr[depth] = num[i];
            backTracking(i+1,depth+1);
        }
    }
}