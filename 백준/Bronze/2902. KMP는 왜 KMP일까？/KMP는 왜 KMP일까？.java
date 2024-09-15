import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] strArr = str.split("-");

        StringBuilder sb = new StringBuilder();

        for (String s : strArr) {
            String temp = s.substring(0, 1);
            sb.append(temp);
        }

        System.out.println(sb);
    }
}