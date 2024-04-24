import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<A.length; i++) {
            int su = A[i];
            if (su >= num) {
                while(su >= num) {
                    stack.push(num++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                int temp = stack.pop();
                if(temp > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }else {
                    sb.append("-").append("\n");
                }
            }
        }

        if(result) {
            System.out.println(sb);
        }

    }

}