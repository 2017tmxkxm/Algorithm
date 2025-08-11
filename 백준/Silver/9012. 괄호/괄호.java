import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            char[] charArray = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean isEnd = false;
            for(char now : charArray) {
                if(now == '(') {
                    stack.push(now);
                }else{
                    if(stack.isEmpty()) {
                        System.out.println("NO");
                        isEnd = true;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(!isEnd) {
                if(stack.isEmpty()) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
