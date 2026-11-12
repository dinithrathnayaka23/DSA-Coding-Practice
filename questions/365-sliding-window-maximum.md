# 365. Sliding Window Maximum

**Question:** Return the maximum of every window of size k.

**Answer:** Monotonic deque of indices holding decreasing values; the front is the window max.

```java
int[] res = new int[nums.length - k + 1];
Deque<Integer> dq = new ArrayDeque<>();
for (int i = 0; i < nums.length; i++) {
    while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
    while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
    dq.addLast(i);
    if (i >= k - 1) res[i - k + 1] = nums[dq.peekFirst()];
}
return res;
```

**Complexity:** O(n) time, O(k) space.
