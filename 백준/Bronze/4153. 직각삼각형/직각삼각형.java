import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a==0 && b==0 && c==0) break;
            boolean result = false;
            if(b < a && c < a) {
                if(a*a == b*b + c*c) result = true;
            } else if (a < b && c < b) {
                if(b*b == a*a + c*c) result = true;
            }else {
                if(c*c == b*b + a*a) result = true;
            }

            if(result) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }

    }
}