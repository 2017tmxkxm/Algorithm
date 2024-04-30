import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");
        String[] people = br.readLine().split(" ");
        int L = Integer.parseInt(A[0]);
        int P = Integer.parseInt(A[1]);

        int sum = L * P;

        for (int i=0; i<5; i++) {
            System.out.print(Integer.parseInt(people[i]) - sum + " ");
        }
    }
}