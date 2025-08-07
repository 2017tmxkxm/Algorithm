import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Students> arrayList = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            arrayList.add(new Students(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(arrayList);

        System.out.println(arrayList.get(N-1).name);
        System.out.println(arrayList.get(0).name);
    }
}

class Students implements Comparable<Students> {
    String name;
    int dd;
    int mm;
    int yyyy;

    public Students(String name, int dd, int mm, int yyyy) {
        this.name = name;
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }


    @Override
    public int compareTo(Students o) {
        if(this.yyyy == o.yyyy) {
            if(this.mm == o.mm) {
                return this.dd - o.dd;
            } else {
                return this.mm - o.mm;
            }
        } else {
            return this.yyyy - o.yyyy;
        }

    }
}
