import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        ArrayList<Student> arrayList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            arrayList.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(arrayList);

        for(Student student : arrayList) {
            System.out.println(student.name);
        }

    }
}

class Student implements Comparable<Student> {
    String name;
    int k;
    int e;
    int m;

    public Student(String name, int k, int e, int m) {
        this.name = name;
        this.k = k;
        this.e = e;
        this.m = m;
    }

    @Override
    public int compareTo(Student o) {
        if(o.k == this.k && o.e == this.e && o.m == this.m) {
            return this.name.compareTo(o.name);
        } else if (o.k == this.k && o.e == this.e) {
            return o.m - this.m;
        } else if (o.k == this.k) {
            return this.e - o.e;
        } else {
            return o.k - this.k;
        }
    }
}
