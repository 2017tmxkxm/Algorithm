import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            if(temp!=0) stack.push(temp);
            else stack.pop();
        }

        int sum = 0;
        int size = stack.size();
        if(stack.isEmpty()) {
            System.out.println(0);
        }
        else {
            for(int i=0; i<size; i++) {
                sum += stack.pop();
            }
            System.out.println(sum);
        }
    }
}
