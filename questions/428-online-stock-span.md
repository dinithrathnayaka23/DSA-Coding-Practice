# 428. Online Stock Span

**Question:** For each daily price, return the number of consecutive previous days with price at most today's.

**Answer:** Monotonic stack of (price, span) pairs; pop smaller prices and add their spans.

```java
Deque<int[]> st = new ArrayDeque<>();
int next(int price) {
    int span = 1;
    while (!st.isEmpty() && st.peek()[0] <= price) span += st.pop()[1];
    st.push(new int[]{price, span});
    return span;
}
```

**Complexity:** O(1) amortized per call, O(n) space.
