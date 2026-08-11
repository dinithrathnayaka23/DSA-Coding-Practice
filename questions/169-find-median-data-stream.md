# 169. Median From Data Stream

**Question:** Maintain the median as numbers are inserted.

**Answer:** Keep a max-heap for the lower half and a min-heap for the upper half, balancing their sizes.

```java
if (lower.isEmpty() || value <= lower.peek()) lower.offer(value); else upper.offer(value); rebalance();
double median() { return lower.size() == upper.size() ? (lower.peek() + upper.peek()) / 2.0 : lower.peek(); }
```

**Complexity:** O(log n) insertion, O(1) median, O(n) space.
