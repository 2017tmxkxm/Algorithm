import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//투 포인터
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int count = 0;

        for (int i=0; i<N; i++) {
            int start = 0;
            int end = N-1;
            int good = A[i];

            while (start < end) {
              if (A[start]+A[end] == good) {
                  if (start != i && end != i) {
                      count++;
                      break;
                  } else if (start == i) {
                      start++;
                  } else {
                      end--;
                  }
              } else if (A[start]+A[end] < good) {
                  start++;
              } else {
                  end--;
              }
            }
        }
        System.out.println(count);
    }
}
