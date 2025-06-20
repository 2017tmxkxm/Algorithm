import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        ArrayList<B> Bs = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            Bs.add(new B(i, Integer.parseInt(st.nextToken())));
        }

        Bs.sort(Comparator.comparingInt(o -> o.value));

        int[] answer = new int[M];
        int A_start_index = 0;

        for(int i=0; i<Bs.size() && A_start_index < A.length;) {
            if(A[A_start_index] > Bs.get(i).value) {
                answer[Bs.get(i).index] = 0;
                i++;
            } else if(A[A_start_index] == Bs.get(i).value){
                answer[Bs.get(i).index] = 1;
                i++;
                A_start_index++;
            } else { //A[A_start_index] < Bs.get(i).value
                A_start_index++;
            }
        }

        for (int j : answer) {
            System.out.print(j + " ");
        }
    }
}

class B {
    int index;
    int value;

    public B(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
