import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            char[] ox = st.nextToken().toCharArray();
            int sum = 0;
            int count = 0;
            for(int j=0; j<ox.length; j++) {
                if(ox[j] == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(sum);
        }
    }
}