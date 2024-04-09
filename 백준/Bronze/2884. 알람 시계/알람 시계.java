import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int hour = Integer.parseInt(inputs[0]);
        int min = Integer.parseInt(inputs[1]);

        if (min < 45) {
            hour --;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min -45));
        }
    }
}