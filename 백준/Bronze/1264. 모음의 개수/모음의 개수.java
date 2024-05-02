import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String a = br.readLine();
            String temp = a.replaceAll(" ", "");
            char[] G = temp.toCharArray();
            if (a.equals("#")) break;
            int sum = 0;
            for(int i=0; i<G.length; i++) {
                if (G[i] == 'a' || G[i] == 'A') {
                    sum ++;
                } else if (G[i] == 'e' || G[i] == 'E') {
                    sum ++;
                } else if (G[i] == 'i' || G[i] == 'I') {
                    sum ++;
                } else if (G[i] == 'o' || G[i] == 'O') {
                    sum ++;
                } else if (G[i] == 'u' || G[i] == 'U') {
                    sum ++;
                }
            }

            System.out.println(sum);
        }

    }
}