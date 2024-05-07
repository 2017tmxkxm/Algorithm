import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M>0) {
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                char[] b = st.nextToken().toCharArray();
                for (int j=M-1; j>=0; j--) {
                    System.out.print(b[j]);
                }
                System.out.println();
            }
        }
    }
}