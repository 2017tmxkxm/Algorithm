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

    @Override
    public int compareTo(Node other) {
        if(this.distance < other.distance) {
            return -1;
        }
        return 1;
    }
}

public class Main {
    static final int INF = 200000000;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    static int[] di;
    static int V, E, v1, v2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        
        di = new int[V+1];

        for(int i=0; i<=V; i++) {
            graph.add(new ArrayList<Node>());
        }

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(s).add(new Node(e,w));
            graph.get(e).add(new Node(s,w));
        }

        st = new StringTokenizer(br.readLine());
        v1 = Integer.parseInt(st.nextToken());
        v2 = Integer.parseInt(st.nextToken());

        // 1 -> v1 -> v2 -> V
        int sum1 = 0;
        sum1 += dijkstra(1, v1);
        sum1 += dijkstra(v1, v2);
        sum1 += dijkstra(v2, V);

        int sum2 = 0;
        // 1 -> v2 -> v1 -> V
        sum2 += dijkstra(1, v2);
        sum2 += dijkstra(v2, v1);
        sum2 += dijkstra(v1, V);

        if (sum1 >= INF && sum2 >= INF) System.out.println(-1);
        else System.out.println(Math.min(sum1, sum2));

    }

    private static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Arrays.fill(di, INF);
        pq.offer(new Node(start, 0));
        di[start] = 0;
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            int diNow = node.getDistance();
            int now = node.getIndex();
            if(di[now] < diNow) continue;
            for(int i=0; i<graph.get(now).size(); i++) {
                int cost = di[now] + graph.get(now).get(i).getDistance();
                if(cost < di[graph.get(now).get(i).getIndex()]) {
                    di[graph.get(now).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(), cost));
                }
            }
        }

        return di[end];
    }
}