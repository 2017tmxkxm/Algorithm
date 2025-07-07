import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();

        int count = 0;
        boolean change = true;

        for(int i=1; i<S.length; i++) {
            if(S[i-1] != S[i]) {
                S[i] = S[i-1];
                if(change) {
                    count++;
                    change = false;
                }
            } else {
                change = true;
            }
        }

        System.out.println(count);
    }
}
