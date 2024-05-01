import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int S = 0;
        int T = 0;

        for (int i=0; i<4; i++) {
            S += Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            T += Integer.parseInt(st2.nextToken());
        }

        if (S == T) {
            System.out.println(S);
        } else {
            System.out.println(Math.max(S, T));
        }

    }
}