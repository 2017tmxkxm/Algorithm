import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] A;
    static boolean[][] visited;
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        BFS(0,0);
        System.out.println(A[n-1][m-1]);
    }

    private static void BFS(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a,b});
        visited[a][b] = true;
        while(!q.isEmpty()){
            int[] now = q.poll();
            for(int i=0; i<4; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                if (x>=0 && y>=0 && x<n && y<m) {
                    if(!visited[x][y] && A[x][y] !=0) {
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
    }
}