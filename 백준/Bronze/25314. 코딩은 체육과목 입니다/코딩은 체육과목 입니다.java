import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        int longCnt = num / 4;

        for (int i = 0; i < longCnt; i++) {
            sb.append("long ");
        }

        System.out.println(sb + "int");
    }
}