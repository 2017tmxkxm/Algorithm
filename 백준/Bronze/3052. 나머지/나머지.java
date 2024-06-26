import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> num = new HashSet<>();
        for(int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken()) % 42;
            num.add(temp);
        }

        System.out.println(num.size());
    }
}