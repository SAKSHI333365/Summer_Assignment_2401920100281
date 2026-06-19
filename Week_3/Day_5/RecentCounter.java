package Week_3.Day_5;

import java.util.LinkedList;
import java.util.Queue;

/*

Problem:Recent Counter

Approach:
Use a queue and remove requests older than 3000 ms.

Time Complexity:O(1)
Space Complexity:O(n)

*/

public class RecentCounter {

    Queue<Integer> q = new LinkedList<>();

    public int ping(int t) {
        q.offer(t);

        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
