import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Member> member = new ArrayList<>();

        for(int i=0; i<N; i++) {
            member.add(new Member(sc.nextInt(), sc.nextInt()));
        }
        
        int count = 1;

        for(int i=0; i<N; i++) {
            int now_w = member.get(i).weight;
            int now_k = member.get(i).key;
            for(int j=0; j<N; j++) {
                if(now_w < member.get(j).weight && now_k < member.get(j).key) {
                    count++;
                }
            }

            System.out.println(count);

            count = 1;

        }
    }
}

class Member {
    int weight;
    int key;

    public Member(int weight, int key) {
        this.weight = weight;
        this.key = key;
    }

}
