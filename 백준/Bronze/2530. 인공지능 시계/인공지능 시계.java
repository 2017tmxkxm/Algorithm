import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split(" ");
        int A = Integer.parseInt(N[0]);
        int B = Integer.parseInt(N[1]);
        int C = Integer.parseInt(N[2]);

        int D = Integer.parseInt(br.readLine());

        // 초 -> 분 -> 시 순으로 구하기
        C += D;
        if (C > 59) {
            B += C/60;
            C = C % 60;
        }

        if (B > 59) {
            A += B/60;
            B = B % 60;
        }

        if (A > 23) A = A % 24;

        System.out.println(A + " " + B + " " + C);
    }
}