import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i=0; i<9; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a > max) {
                max = a;
                index = i+1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}