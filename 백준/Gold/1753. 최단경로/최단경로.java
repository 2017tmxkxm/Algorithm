import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {

    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    // 거리가 짧은 것이 높은 우선순위를 가지도록 설정
    @Override
    public int compareTo(Node other) {
        if(this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class Main {
    static final int INF = (int) 1e9;   // 무한을 의미하는 10억을 설정
    static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>(); // 각 노드에 연결되어 있는 정보
    static int[] dist = new int[20001]; // 최단 거리 배열 테이블
    static int V, E, start; // 노드의 개수(V), 간선의 개수(E), 출발 노드 번호(start)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken()); // 정점
        E = Integer.parseInt(st.nextToken()); // 간선
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st1.nextToken());

        // 그래프 초기화
        for(int i=0; i<=V; i++) {
            graph.add(new ArrayList<Node>());
        }

        // 모든 간선 정보 입력받기
        for(int i=0; i<E; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st2.nextToken());
            int e = Integer.parseInt(st2.nextToken());
            int w = Integer.parseInt(st2.nextToken());
            graph.get(s).add(new Node(e, w));
        }

        // 최단 거리 배열 테이블 모두 무한으로 초기화
        Arrays.fill(dist, INF);

        // 다익스트라 알고리즘 실행
        dijkstra(start);

        // 모든 노드로 가기 위한 최단 거리를 출력
        for(int i=1; i<=V; i++) {
            // 도달할 수 없는 경우
            if(dist[i] == INF) {
                System.out.println("INF");
            }else {
                System.out.println(dist[i]);
            }
        }

    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dist[start] = 0;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int distNow = node.getDistance();   // 현재 노드까지의 거리
            int now = node.getIndex();          // 현재 노드
            if(dist[now] < distNow) continue;   // 현재 노드가 이미 처리된 적이 있는 노드라면 무시
            for(int i=0; i<graph.get(now).size(); i++) {
                int cost = dist[now] + graph.get(now).get(i).getDistance();
                if (cost < dist[graph.get(now).get(i).getIndex()]) {
                    dist[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }
    }
}



