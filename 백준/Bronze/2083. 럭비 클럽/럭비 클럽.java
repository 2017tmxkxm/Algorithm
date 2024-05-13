import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String n = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if (n.equals("#") && a == 0 && w == 0) {
                break;
            }
            if (a > 17 || w >= 80) {
                System.out.println(n + " Senior");
            } else {
                System.out.println(n + " Junior");
            }
        }
    }
}