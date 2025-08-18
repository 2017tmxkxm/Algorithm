import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[20000];
        int start_index = 10000;    //덱에 첫번째 데이터를 가르키는 index
        int end_index = 10001;      //덱에 마지막 데이터의 다음을 가르키는 index

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String m = st.nextToken();
            int v = -1;
            if(st.hasMoreTokens()) {
                v = Integer.parseInt(st.nextToken());
            }
            switch (m) {
                case "push_front":
                    A[start_index] = v;
                    start_index--;
                    break;
                case "push_back":
                    A[end_index] = v;
                    end_index++;
                    break;
                case "pop_front":
                    if(start_index == end_index-1) {
                        System.out.println(-1);
                    }else {
                        System.out.println(A[++start_index]);
                    }
                    break;
                case "pop_back":
                    if(start_index == end_index-1) {
                        System.out.println(-1);
                    }else {
                        System.out.println(A[--end_index]);
                    }
                    break;
                case "size":
                    System.out.println(end_index-start_index-1);
                    break;
                case "empty":
                    if(start_index == end_index-1) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(start_index == end_index-1) {
                        System.out.println(-1);
                    }else{
                        System.out.println(A[start_index+1]);
                    }
                    break;
                case "back":
                    if(start_index == end_index-1) {
                        System.out.println(-1);
                    }else{
                        System.out.println(A[end_index-1]);
                    }
                    break;
            }
        }
    }
}
