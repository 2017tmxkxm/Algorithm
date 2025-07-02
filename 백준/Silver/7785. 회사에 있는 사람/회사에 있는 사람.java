import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<String, String> people = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i=0; i<N; i++) {
            people.put(sc.next(), sc.next());
        }

        for(Map.Entry<String, String> entry : people.entrySet()) {
            if(Objects.equals(entry.getValue(), "enter")) {
                arrayList.add(entry.getKey());
            }
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        for(int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
