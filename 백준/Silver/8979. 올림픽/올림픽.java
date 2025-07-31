import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Score_8979> arrayList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arrayList.add(new Score_8979(a, 100*b + 10*c + d));
        }

        Collections.sort(arrayList);

        arrayList.get(0).rank = 1;
        int end_point = 0;

        for(int i=1; i<arrayList.size(); i++) {
            int temp_sum = arrayList.get(i-1).sum;

            if(arrayList.get(i).index == K) {
                end_point = i;
            }

            if(temp_sum == arrayList.get(i).sum) {
                arrayList.get(i).rank = arrayList.get(i-1).rank;
            }else {
                arrayList.get(i).rank = i+1;
            }
        }

        System.out.println(arrayList.get(end_point).rank);
    }
}

class Score_8979 implements Comparable<Score_8979> {
    int index;
    int sum;
    int rank;

    public Score_8979(int index, int sum) {
        this.index = index;
        this.sum = sum;
    }

    @Override
    public int compareTo(Score_8979 o) {
        return o.sum - this.sum;
    }
}
