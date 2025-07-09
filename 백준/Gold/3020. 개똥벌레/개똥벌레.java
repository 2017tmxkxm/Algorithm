import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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

        int[] SS = new int[H+1];
        int[] JS = new int[H+1];

        //석순 구간합 구하기
        for(int i=H-1; i>0; i--) {
            SS[i] = SS[i+1] + S[i];
        }

        //종유석 구간합 구하기
        for(int i=H-1; i>0; i--) {
            JS[i] = JS[i+1] + J[i];
        }

        //석순/종유석 구간합 합치기
        int[] A = new int[H+1];
        for(int i=1; i<=H; i++) {
            A[i] = SS[i] + JS[JS.length-i];
        }

        int count = 0;
        int temp = Integer.MAX_VALUE;
        for(int i=1; i<=H; i++) {
            if(temp > A[i]) temp = A[i];
        }

        for(int i=1; i<=H; i++) {
            if(temp == A[i]) count++;
        }

        System.out.println(temp + " " + count);
    }
}
