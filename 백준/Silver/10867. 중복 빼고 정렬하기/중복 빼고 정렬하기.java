import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            set.add(temp);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
