import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class City {
    // 출발 도시
    int start;
    // 도착도시
    int end;
    // 이동시간
    int distance;

    public City(int start, int end, int distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }
}

public class Main {
    // 도시의 개수, 노선의 개수
    static int N,M;
    // 인접 리스트
    static City[] city;
    // 최단 거리
    static long[] dist;
    static long INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 최단거리 무한대 데이터 삽입
        dist = new long[N+1];
        Arrays.fill(dist, INF);
        dist[1] = 0;

        city = new City[M];

        // 단방향 인접 리스트 데이터 삽입
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            city[i] = new City(start, end, distance);
        }

        // 음수 순환 존재하면 -1 출력
        if(bellmanFord()) {
            System.out.println(-1);
        } else {
            for(int i=2; i<dist.length; i++) {
                if(dist[i] == INF) {
                    System.out.println(-1);
                }else {
                    System.out.println(dist[i]);
                }
            }
        }

        br.close();
    }

    private static boolean bellmanFord() {
        boolean minusCycle = false;

        // N번 반복
        for(int i=0; i<N+1; i++) {
            // 매 반복마다 모든 간선 확인
            for(int j=0; j<M; j++) {
                City now = city[j];

                if(dist[now.start] == INF) {
                    continue;
                }

                if(dist[now.start] + now.distance < dist[now.end]) {
                    dist[now.end] = dist[now.start] + now.distance;
                    // N번째에서도 값이 갱신된다면 음수 순환이 존재
                    if(i == N) {
                        minusCycle = true;
                        break;
                    }
                }
            }
        }
        return minusCycle;
    }
}