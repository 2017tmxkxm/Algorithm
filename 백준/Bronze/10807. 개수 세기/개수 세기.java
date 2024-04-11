import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cnt = br.readLine();

        String[] nums = br.readLine().split(" ");

        String search = br.readLine();

        int answer = 0;

        for (String num : nums) {
            if (num.equals(search)) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}