import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String text = br.readLine();
            if (text.equals("END")) break;
            char[] textArr = text.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i = text.length()-1; i>=0; i--) {
                sb.append(textArr[i]);
            }
            System.out.println(sb);
        }
    }
}