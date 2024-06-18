import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    // 인접 리스트
    static ArrayList<Integer>[] A;
    // 방문 배열
    static boolean[] visited;
    // 정답 배열
    static int[] answer;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 노드의 개수
        int N = Integer.parseInt(br.readLine());

        // 인접 리스트 초기화 - index를 1부터 사용하기 위해 N+1
        A = new ArrayList[N+1];
        for(int i=1; i<N+1; i++) {
            A[i] = new ArrayList<>();
        }

        // 방문 배열 선언
        visited = new boolean[N+1];

        // 정답 배열 선언
        answer = new int[N+1];

        // 인접 리스트 데이터 삽입
        for(int i=0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        // 방문 처리
        for(int i=1; i<N+1; i++) {
            // 방문하지 않았다면
            if(!visited[i]) {
                DFS(i);
            }
        }

        // 정답 배열 출력
        for(int i=2; i<=N; i++) {
            System.out.println(answer[i]);
        }

    }

    private static void DFS(int n) {
        if(visited[n]) return;
        visited[n] = true;
        for(int i : A[n]) {
            if(!visited[i]) {
                // 자식 노드로 가기 직전에 현재 노드가 다음에 탐색할 노드의 부모 노드
                answer[i] = n;
                DFS(i);
            }
        }
    }
}