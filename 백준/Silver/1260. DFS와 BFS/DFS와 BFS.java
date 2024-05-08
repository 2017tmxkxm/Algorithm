import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        // 인접 리스트 초기화
        for(int i=1; i<n+1; i++) {
            A[i] = new ArrayList<>();
        }

        // 인접 리스트 데이터 삽입
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);

        }

        // 인접리스트 정렬
        for (int i=1; i<n+1; i++) {
            Collections.sort(A[i]);
        }

        // DFS
        DFS(start);
        sb.append("\n");
        
        //BFS
        visited = new boolean[n+1];
        BFS(start);
        System.out.println(sb);
    }

    private static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            sb.append(temp).append(" ");
            for(int i: A[temp]) {
                if(!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

    }

    private static void DFS(int start) {
        if(visited[start]) return;
        visited[start] = true;
        sb.append(start).append(" ");
        for(int i : A[start]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}

