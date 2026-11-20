# 425. Kth Largest Element in a Stream

**Question:** Design a class that returns the kth largest element after each added value.

**Answer:** Keep a min-heap of size k; its root is the kth largest.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
int k;
int add(int val) {
    pq.add(val);
    if (pq.size() > k) pq.poll();
    return pq.peek();
}
```

**Complexity:** O(log k) per add, O(k) space.
