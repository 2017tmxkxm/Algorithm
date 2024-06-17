import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0) {
                if(queue.isEmpty()) {
                    System.out.println("0");
                }else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(input);
            }
        }
    }
}