import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();
        int[] temp = new int[26];

        for(int i=0; i<S.length; i++) {
            temp[S[i]-97]++;
        }

        for(int i=0; i<temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}