import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        for(int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            sum += temp;
            if (temp < minA) minA = temp;
        }

        for(int i=0; i<2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            sum += temp;
            if (temp < minB) minB = temp;
        }

        System.out.println(sum - minA - minB);
    }
}