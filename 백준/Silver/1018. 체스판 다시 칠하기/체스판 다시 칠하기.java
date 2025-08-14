import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] B = new char[N][M];

        for(int i=0; i<N; i++) {
            char[] temp = br.readLine().toCharArray();
            for(int j=0; j<M; j++) {
                B[i][j] = temp[j];
            }
        }

        int min = Integer.MAX_VALUE;
        for(int x=0; x<=N-8; x++) { //체스판이 시작될 수 있는 x,y 전체탐색
            for(int y=0; y<=M-8; y++) {
                int w_cnt = 0;
                for(int i=x; i<x+8; i++) {  //체스판 탐색하면서 검토
                    for(int j=y; j<y+8; j++) {
                        if((i+j)%2==1 && B[i][j]=='W') {
                            w_cnt++;
                        }else if ((i+j)%2==0 && B[i][j]=='B'){
                            w_cnt++;
                        }
                    }
                }
                min = Math.min(min, Math.min(w_cnt, 64 - w_cnt));
            }
        }
        System.out.println(min);
    }
}
