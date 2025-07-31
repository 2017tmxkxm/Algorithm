import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Score> scoreArrayList = new ArrayList<>();

        for(int i=1; i<=8; i++) {
            scoreArrayList.add(new Score(i, sc.nextInt()));
        }

        Collections.sort(scoreArrayList);

        int sum = 0;
        int[] result = new int[5];
        for(int i=0; i<5; i++) {
            Score now = scoreArrayList.get(i);
            sum += now.value;
            result[i] = now.index;
        }

        System.out.println(sum);
        Arrays.sort(result);

        for(int i=0; i<5; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

class Score implements Comparable<Score> {
    int index;
    int value;

    public Score(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Score o) {
        return o.value - this.value;
    }
}