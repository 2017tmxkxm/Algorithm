import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] A = new int[N.length()];

        for(int i=0; i<N.length(); i++) {
            A[i] = Integer.parseInt(N.substring(i, i+1));
        }

        // 선택정렬 사용
        for (int i=0; i<N.length(); i++) {
            int max_index = i;
            for (int j=i+1; j<N.length(); j++) {
                if (A[j] > A[max_index]) {
                    max_index = j;
                }
            }
            if (A[i] < A[max_index]) {
                int temp = A[i];
                A[i] = A[max_index];
                A[max_index] = temp;
            }
        }

        for (int i=0; i<N.length(); i++) {
            System.out.print(A[i]);
        }

    }
}