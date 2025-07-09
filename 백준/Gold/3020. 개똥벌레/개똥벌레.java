import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//개똥벌레_누적합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        //석순(S)/종유석(J) 구분하여 size 데이터 받기
        //0부터 시작이 아니라 1부터 시작하기 위하여 +1
        int[] S = new int[H+1];
        int[] J = new int[H+1];

        //석순과 종유석 size를 받아 해당 size에 ++ 해주기.
        //예를 들어 석순의 size가 5이면 5 index ++
        for(int i=1; i<=N; i++) {
              int size = Integer.parseInt(br.readLine());
              if(i%2==1) S[size]++;
              else J[size]++;
        }

        //석순/종유석 구간합 구하기
        //S[i] = S[i+1] + S[i]
        for(int i=H-1; i>0; i--) {
            S[i] = S[i+1] + S[i];
            J[i] = J[i+1] + J[i];
        }

        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i=1; i<=H; i++) {
            int temp = S[i] + J[H+1-i];
            if(temp < min) {
                min = temp;
                count = 1;
            } else if (temp==min) {
                count++;
            }
        }

        System.out.println(min + " " + count);
    }
}
