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
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int start_index = 0;
        int end_index = 0;
        int count = 0;
        int sum = A[0];

        while(end_index < N) {
            if(sum < M) {
                end_index++;
                if(end_index < N) {
                    sum += A[end_index];
                }else{
                    break;
                }

            }else if(sum > M) {
                sum -= A[start_index];
                start_index++;
            }else{
                count++;
                sum -= A[start_index];
                start_index++;
                end_index++;
                if(end_index < N) {
                    sum += A[end_index];
                }else{
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
