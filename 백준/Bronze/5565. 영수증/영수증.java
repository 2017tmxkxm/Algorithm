import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());

        for(int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            int book = Integer.parseInt(st.nextToken());
            sum -= book;
        }

        System.out.println(sum);
    }
}