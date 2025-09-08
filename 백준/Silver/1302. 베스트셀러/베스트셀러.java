import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> book = new HashMap<>();

        for(int i=0; i<N; i++) {
            String name = br.readLine();
            if(book.containsKey(name)) {
                book.put(name, book.get(name)+1);
            }else{
                book.put(name, 1);
            }
        }

        ArrayList<String> bookName = new ArrayList<>(book.keySet());
        Collections.sort(bookName);
        bookName.sort((o1, o2) -> book.get(o2).compareTo(book.get(o1)));

        System.out.println(bookName.get(0));
    }
}
