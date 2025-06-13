import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<N; i++) {
            String now = br.readLine();
            if(!arr.contains(now)) {
                arr.add(now);
            }
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 2. 길이가 같으면 사전 순으로
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                // 1. 길이가 짧은 것부터
                return o1.length() - o2.length();
            }
        });

        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
