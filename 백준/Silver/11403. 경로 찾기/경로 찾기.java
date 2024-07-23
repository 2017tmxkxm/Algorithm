import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // 인접 행렬
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int K = 0; K < N; K++) {
            for (int S = 0; S < N; S++) {
                for (int E = 0; E < N; E++) {
                    // 출발 -> 중간 && 중간 -> 도착 경로 있는지 체크
                    if (array[S][K] == 1 && array[K][E] == 1) {
                        array[S][E] = 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        // 정답 행렬 출력
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }

}