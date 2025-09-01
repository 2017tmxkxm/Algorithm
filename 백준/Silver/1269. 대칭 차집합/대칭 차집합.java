import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());

        HashSet<Integer> A = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<nA; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> B = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<nB; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        Iterator<Integer> iteratorA = A.iterator();
        Iterator<Integer> iteratorB = B.iterator();
        while(iteratorA.hasNext()) {
            Integer now = iteratorA.next();
            if(!B.contains(now)) {
                count++;
            }
        }

        while(iteratorB.hasNext()) {
            Integer now = iteratorB.next();
            if(!A.contains(now)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
