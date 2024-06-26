import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            for(int j=n-1; j>=0; j--) {
                if(i>=j) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-2; i>=0; i--) {
            for(int j=n-1; j>=0; j--) {
                if(i>=j) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}