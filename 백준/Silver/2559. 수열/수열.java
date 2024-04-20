import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        String[] temp= br.readLine().split(" ");

        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int max = 0;
        
        int[] Ns = new int[N];

        for (int i=0; i<N; i++) {
            Ns[i] = Integer.parseInt(temp[i]);
        }

        for (int i=0; i<K; i++) {
            max += Ns[i];
        }

        int temp2 = max;
        
        for (int i=K; i<N; i++) {
            temp2 = temp2 -Ns[i-K] + Ns[i];
            max = Math.max(max, temp2);
        }

        System.out.println(max);
    }

}