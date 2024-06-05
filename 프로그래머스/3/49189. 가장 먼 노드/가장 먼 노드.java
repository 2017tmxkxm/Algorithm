import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] dist;
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int maxNum = 0;
        
        graph = new ArrayList<>();
        visited = new boolean[n+1];
        dist = new int[n+1];
        
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int i=0; i<edge.length; i++) {
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        dikstra(1);
        
        for(int i=2; i<=n; i++) {
            maxNum = Math.max(maxNum, dist[i]);
        }
        
        for(int i=2; i<=n; i++) {
            if(maxNum == dist[i]) answer++;
        }
        
        return answer;
    }
    
    private static void dikstra(int now) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(now);
        visited[now] = true;
        
        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(int next : graph.get(temp)) {
                if(!visited[next] && dist[temp] +1 < dist[next]) {
                    dist[next] = dist[temp] +1;
                    queue.add(next);
                    visited[temp] = true;
                }
            }
        }
    }
}