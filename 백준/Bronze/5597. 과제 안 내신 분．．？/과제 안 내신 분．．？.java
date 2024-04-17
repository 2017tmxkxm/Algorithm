import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] A = new int[28];  
        for (int i=0; i<28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<=30; i++) {
            int j = i;
            if(!IntStream.of(A).anyMatch(x -> x == j)) {
                System.out.println(j);
            }
        }

    }
}