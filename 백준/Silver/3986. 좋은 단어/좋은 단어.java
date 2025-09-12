import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int count = 0;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            char[] A = st.nextToken().toCharArray();

            Stack<Character> stack = new Stack<>();
            stack.push(A[0]);
            for(int j=1; j<A.length; j++) {
                if(stack.peek() == A[j]) {
                    stack.pop();
                    if(stack.isEmpty() && j+1 < A.length) {
                        stack.push(A[++j]);
                    }
                }else {
                    stack.push(A[j]);
                }
            }

            if(stack.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
