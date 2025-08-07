import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Numbers> arrayList = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arrayList.add(new Numbers(Integer.parseInt(st.nextToken())));
        }

        Collections.sort(arrayList);

        for (Numbers numbers : arrayList) {
            bw.write(numbers.num + "\n");
        }

        bw.flush();
    }
}

class Numbers implements Comparable<Numbers> {
    int num;

    public Numbers(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Numbers o) {
        return o.num - this.num;
    }
}
