# 351. Kth Largest Element in an Array

**Question:** Return the kth largest element of an unsorted array.

**Answer:** Maintain a min-heap of size k; its root is the answer.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
for (int x : nums) {
    pq.add(x);
    if (pq.size() > k) pq.poll();
}
return pq.peek();
```

**Complexity:** O(n log k) time, O(k) space.
