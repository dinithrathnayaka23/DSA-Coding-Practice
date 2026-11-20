# 424. Find Median from Data Stream

**Question:** Design a structure that adds numbers and returns the running median.

**Answer:** Max-heap for the lower half, min-heap for the upper half, kept balanced.

```java
PriorityQueue<Integer> lo = new PriorityQueue<>(Collections.reverseOrder());
PriorityQueue<Integer> hi = new PriorityQueue<>();
void addNum(int x) {
    lo.add(x);
    hi.add(lo.poll());
    if (hi.size() > lo.size()) lo.add(hi.poll());
}
double findMedian() {
    return lo.size() > hi.size() ? lo.peek() : (lo.peek() + hi.peek()) / 2.0;
}
```

**Complexity:** O(log n) add, O(1) median, O(n) space.
