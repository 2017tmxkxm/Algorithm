import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        int aCount = 0;
        int dCount = 0;
        for(int i=0; i<8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<8; i++) {
            if(arr[i] == i+1) {
                aCount++;
            }
        }

        for(int i=8; i>0; i--) {
            if(arr[8-i] == i) {
                dCount++;
            }
        }

        if(aCount == 8) {
            System.out.println("ascending");
        } else if (dCount == 8) {
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}