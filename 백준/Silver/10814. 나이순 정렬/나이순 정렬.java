import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<User> users = new ArrayList<>();

        for(int i=0; i<N; i++) {
            users.add(new User(sc.nextInt(), sc.next()));
        }

        Collections.sort(users);

        for(User now : users) {
            System.out.println(now.age + " " + now.name);
        }
    }
}

class User implements Comparable<User>{

    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
