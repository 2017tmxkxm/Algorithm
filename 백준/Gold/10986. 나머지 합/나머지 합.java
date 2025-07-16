import java.util.Scanner;

//구간합
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        //누적합 배열 S 생성
        long[] S = new long[N];
        S[0] = sc.nextInt();
        for(int i=1; i<N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }

        //(S[j]-S[i])%M=0 -> S[j]%M-S[i]%M=0
        //S를 M으로 나눈 나머지 개수를 체크할 배열 C 생성
        long[] C = new long[M];
        long count = 0;
        for(int i=0; i<N; i++) {
            int remainder = (int) (S[i]%M);
            // 0~i까지의 구간합 자체가 0일 때 count 증가 -> S[2], S[3], S[5]
            if(remainder==0) count++;
            C[remainder]++;
        }

        for(int i=0; i<M; i++) {
            if(C[i]>1) {
                //나머지가 같은 인덱스 중 2개 고르기
                count = count + (C[i]*(C[i]-1)/2);
            }
        }
        System.out.println(count);
    }
}
