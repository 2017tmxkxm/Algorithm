import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());

        long count = 0;

        while(true) {
            count++;
            long tempA = A;
            long tempB = B*count;
            long tempC = C*count;
            if(tempA + tempB < tempC) {
                break;
            }else if(count > 2100000000) {
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}