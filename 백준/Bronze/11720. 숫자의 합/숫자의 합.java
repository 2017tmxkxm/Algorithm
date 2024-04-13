import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String sNum = br.readLine();

        char[] cNum = sNum.toCharArray();

        int sum = 0;

        for (int i=0; i<cNum.length; i++) {
            sum += cNum[i] - '0';
        }

        System.out.println(sum);
    }
}