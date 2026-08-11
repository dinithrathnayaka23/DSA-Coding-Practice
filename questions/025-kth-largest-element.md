# 025. Kth Largest Element

**Question:** Find the kth largest value without fully sorting the array.

**Answer:** Maintain a min-heap of size `k`; its root is the kth largest value.

```java
PriorityQueue<Integer> heap = new PriorityQueue<>();
for (int value : nums) {
    heap.offer(value);
    if (heap.size() > k) heap.poll();
}
return heap.peek();
```

**Complexity:** O(n log k) time, O(k) space.
