import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N+1];
        for(int i=1; i<=N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            //남학생
            if(G==1) {
                for(int j=num; j<=N; j+=num) {
                    A[j] = (A[j]+1)%2;
                }
            }else{  //여학생
                int s_index = num;
                int e_index = num;
                while(s_index>0 && e_index<=N) {
                    if(A[s_index] == A[e_index]) {
                        s_index--;
                        e_index++;
                    }else {
                        break;
                    }
                }
                for(int j=s_index+1; j<e_index; j++) {
                    A[j] = (A[j]+1)%2;
                }
            }
        }

        for(int i=1; i<=N; i++) {
            System.out.print(A[i] + " ");
            if(i%20==0) System.out.println();
        }

    }
}
