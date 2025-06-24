import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int S[] = new int[21];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String commend = st.nextToken();
            int x;
            switch (commend) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    S[x] = 1;
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    S[x] = 0;
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    bw.write(S[x] + "\n");
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    S[x] = (S[x] + 1) % 2;
                    break;
                case "all":
                    Arrays.fill(S, 1);
                    break;
                case "empty":
                    Arrays.fill(S, 0);
                    break;
            }
        }

        bw.flush();
    }
}
