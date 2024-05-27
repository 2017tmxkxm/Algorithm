import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = new char[a.length+1];

        for(int i=1; i<=a.length; i++) {
            b[i] = a[i-1];
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<b.length; i++) {
            sb.append(b[i]);
            if(i%10 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}