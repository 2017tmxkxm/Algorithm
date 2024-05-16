import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");
        int sum = Integer.parseInt(n[0]);
        int minus = Integer.parseInt(n[1]);

        int a = (sum+minus)/2;
        int b = (sum-minus)/2;
        if (minus>sum) {
            System.out.println("-1");
        }else {
            if(a+b==sum&&a-b==minus){
                System.out.println(a + " " + b);
            }else {
                System.out.println("-1");
            }
        }
    }
}