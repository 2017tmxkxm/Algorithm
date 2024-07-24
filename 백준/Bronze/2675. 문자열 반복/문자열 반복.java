import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());


        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            char[] S = st.nextToken().toCharArray();
            for(int j=0; j<S.length; j++) {
                String temp = String.valueOf(S[j]);
                System.out.print(temp.repeat(R));
            }
            System.out.println();
        }
    }
}