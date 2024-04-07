import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> inputs = new ArrayList<String>();

        for (int i =0; i<2; i++) {
            inputs.add(br.readLine());
        }

        int n1 = Integer.parseInt(inputs.get(0));
        int n2 = Integer.parseInt(inputs.get(1));

        int n2_1st = n2%10;
        int n2_2nd = n2/10%10;
        int n2_3rd = n2/100%100;

        wr.write(n2_1st*n1 + "\n");
        wr.write(n2_2nd*n1 + "\n");
        wr.write(n2_3rd*n1 + "\n");
        wr.write(n2_1st*n1 +  n2_2nd*n1*10 + n2_3rd*n1*100 + "\n");
        
        wr.flush();
        wr.close();
    }
}