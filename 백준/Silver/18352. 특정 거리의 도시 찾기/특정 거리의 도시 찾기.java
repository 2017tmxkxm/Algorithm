

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    // 노드 클래스 생성
    private static class Node implements Comparable<Node> {
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
            if(this.distance < other.distance){
                return -1;
            }
            return 1;
        }
    }

    // 간선 개수 최댓값(1,000,000) * 거리(1) 최댓값
    static final int INF = 1000000;
    // 인접 리스트
    static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    // 시작점에서 각 도시로 가는 최단거리
    static int di[];
    // 도시개수, 도로개수, 최단거리, 출발도시
    static int city, road, shortDi, start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        city = Integer.parseInt(st.nextToken());
        road = Integer.parseInt(st.nextToken());
        shortDi = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        di = new int[city+1];

        for(int i=0; i<=city; i++) {
            graph.add(new ArrayList<Node>());
        }

        for(int i=0; i<road; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph.get(start).add(new Node(end, 1));
        }

        dijkstra(start);

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<di.length; i++) {
            if(di[i] == shortDi) {
                count ++;
                sb.append(i).append("\n");
            }
        }

        if(count > 0) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Arrays.fill(di, INF);
        pq.offer(new Node(start, 0));
        di[start] = 0;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int nowCity = node.getIndex();
            int nowDi = node.getDistance();
            // 현재 최단 거리보다 클 경우 무시
            if(di[nowCity] < nowDi) continue;
            for(int i=0; i<graph.get(nowCity).size(); i++) {
                // 선택 도시의 최단 거리 배열의 값 + 도시간 거리
                int cost = di[nowCity] + graph.get(nowCity).get(i).getDistance();
                // cost < 연결 노드의 최단 거리 배열의 값
                if(cost < di[graph.get(nowCity).get(i).getIndex()]) {
                    // 연결 도시의 최단 거리 배열 값 cost로 업데이트
                    di[graph.get(nowCity).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(nowCity).get(i).getIndex(), cost));
                }
            }
        }
    }
}
