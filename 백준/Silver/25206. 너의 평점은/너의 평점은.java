import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result = 0;
        double unitSum = 0;
        double unit;

        for(int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            unit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(!grade.equals("P")) {

                unitSum += unit;

                switch (grade) {
                    case "A+":
                        unit *= 4.5;
                        break;
                    case "A0":
                        unit *= 4.0;
                        break;
                    case "B+":
                        unit *= 3.5;
                        break;
                    case "B0":
                        unit *= 3.0;
                        break;
                    case "C+":
                        unit *= 2.5;
                        break;
                    case "C0":
                        unit *= 2.0;
                        break;
                    case "D+":
                        unit *= 1.5;
                        break;
                    case "D0":
                        unit *= 1.0;
                        break;
                    case "F":
                        unit *= 0.0;
                        break;
                    case "P":
                        break;

                }
                result += unit;
            }

        }

        System.out.println(result / unitSum);
    }
}
