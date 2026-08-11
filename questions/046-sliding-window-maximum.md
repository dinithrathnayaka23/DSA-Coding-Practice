# 046. Sliding Window Maximum

**Question:** Return the maximum value in every window of size `k`.

**Answer:** Store indices in decreasing value order and remove expired indices from the front.

```java
Deque<Integer> deque = new ArrayDeque<>();
for (int i = 0; i < nums.length; i++) {
    while (!deque.isEmpty() && deque.peekFirst() <= i - k) deque.pollFirst();
    while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) deque.pollLast();
    deque.addLast(i);
    if (i >= k - 1) answer[i - k + 1] = nums[deque.peekFirst()];
}
```

**Complexity:** O(n) time, O(k) space.
