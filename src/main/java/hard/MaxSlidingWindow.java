package hard;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

    private MaxSlidingWindow() {
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int left = 0;
        Deque<Integer> q = new LinkedList<>();
        for (int right = 0; right < nums.length; right++) {
            if (!q.isEmpty() &&  left > q.peekFirst() ) {
                q.pollFirst();
            }
            while (!q.isEmpty() && nums[right] > nums[q.peekLast()]) {
                q.pollLast();
            }
            q.offer(right);

            if (right >= k - 1) {
                result[left++] = nums[q.peekFirst()];
            }
        }
        return result;
    }
}
