import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            // a가 들어오면 0번째 체크, z가 들어오면 25번째 체크
            int[] check = new int[26];
            char[] charArray = br.readLine().toCharArray();

            char before = charArray[0];
            check[(int)(before-'a')] = 1;
            boolean group = true;

            for(int j=1; j<charArray.length; j++) {
                char now = charArray[j];
                // 연속된 글자가 아니고, 이전에 들어온 경우가 있는 경우 (그룹단어 X)
                if(before!=now && check[(int)(now-'a')]==1) {
                    group = false;
                    break;
                }
                before = now;
                check[(int)(now-'a')] = 1;
            }
            if(group) {
                count++;
            }
        }
        System.out.println(count);
    }
}
