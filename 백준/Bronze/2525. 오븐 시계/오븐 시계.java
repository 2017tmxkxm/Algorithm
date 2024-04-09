import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int hour = Integer.parseInt(inputs[0]);
        int min = Integer.parseInt(inputs[1]);

        int num = Integer.parseInt(br.readLine());

        if (num + min > 59) {
            hour += (num + min) / 60;
            min = (num + min) % 60;

            if (hour > 23) {
                hour = (hour - 24 == 24) ? 0 : hour -24;
            }
            System.out.println(hour + " " + min);
        } else {
            min = num + min;
            System.out.println(hour + " " + min);
        }
    }
}