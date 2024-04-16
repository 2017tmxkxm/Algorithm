import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");

        int[] P = {1, 1, 2, 2, 2, 8};

        for(int i=0; i<6; i++) {
            int a = Integer.parseInt(inputs[i]);
            sb.append(P[i] - a).append(" ");
        }

        System.out.println(sb);
    }
}