# 060. Kth Largest Element in a Stream

**Question:** Maintain the kth largest value as numbers arrive one at a time.

**Answer:** Keep a min-heap containing only the largest `k` values seen so far.

```java
int add(int value) {
    heap.offer(value);
    if (heap.size() > k) heap.poll();
    return heap.peek();
}
```

**Complexity:** O(log k) per insertion, O(k) space.
