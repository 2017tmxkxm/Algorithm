import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐 선언
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            // 절댓값 작은 데이터 우선
            int frist_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (frist_abs == second_abs) {      // 절댓값 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return frist_abs - second_abs;
        });

        for (int i=0; i<N; i++) {
            int request = Integer.parseInt(br.readLine());
            // 0일 때
            if (request == 0) {
                if(q.isEmpty()) {
                    System.out.println("0");
                }else {
                    System.out.println(q.poll());
                }
           }else { // 0이 아닐 때
                q.add(request);
            }
        }
    }
}