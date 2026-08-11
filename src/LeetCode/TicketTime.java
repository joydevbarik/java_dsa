import java.util.*;

public class TicketTime {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }

        int time = 0;

        while (!queue.isEmpty()) {
            int person = queue.poll();

            tickets[person]--;
            time++;

            if (tickets[k] == 0) {
                break;
            }

            if (tickets[person] > 0) {
                queue.add(person);
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;

        System.out.println(timeRequiredToBuy(tickets, k));
    }
}