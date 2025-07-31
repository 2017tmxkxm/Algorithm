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
            int index = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            arrayList.add(new Score_8979(index, gold, silver, bronze, 0));
        }

        Collections.sort(arrayList);

        arrayList.get(0).rank = 1;
        int end_point = 0;

        for(int i=1; i<arrayList.size(); i++) {
            int tmp_gold = arrayList.get(i-1).gold;
            int tmp_silver  = arrayList.get(i-1).silver;
            int tmp_bronze  = arrayList.get(i-1).bronze;
            Score_8979 now = arrayList.get(i);

            if(arrayList.get(i).index == K) {
                end_point = i;
            }

            if (now.gold == tmp_gold && now.silver==tmp_silver && now.bronze==tmp_bronze) {
                arrayList.get(i).rank = arrayList.get(i-1).rank;
            } else {
                arrayList.get(i).rank = i+1;
            }
        }

        System.out.println(arrayList.get(end_point).rank);
    }
}

class Score_8979 implements Comparable<Score_8979> {
    int index;
    int gold;
    int silver;
    int bronze;
    int rank;

    public Score_8979(int index, int gold, int siver, int bronze, int rank) {
        this.index = index;
        this.gold = gold;
        this.silver = siver;
        this.bronze = bronze;
        this.rank = rank;
    }


    @Override
    public int compareTo(Score_8979 o) {
        if(this.gold==o.gold) {
            if(this.silver==o.silver) {
                return o.bronze-this.bronze;
            }
            else {
                return o.silver-this.silver;
            }
        }
        else {
            return o.gold-this.gold;
        }
    }
}
