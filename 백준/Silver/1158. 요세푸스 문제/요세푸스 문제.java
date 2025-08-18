import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            arrayList.add(i);
        }

        int index = K-1;
        System.out.print("<");
        while(!arrayList.isEmpty()){
            index %= arrayList.size();
            if(arrayList.size() != 1) {
                System.out.print(arrayList.get(index) + ", ");
            }else {
                System.out.print(arrayList.get(index)+">");
            }
            arrayList.remove(index);
            index += K-1;
        }
    }
}
