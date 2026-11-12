# 364. Largest Rectangle in Histogram

**Question:** Find the area of the largest rectangle in a histogram.

**Answer:** Monotonic increasing stack; popping a bar fixes its height and its width.

```java
Deque<Integer> st = new ArrayDeque<>();
int best = 0;
for (int i = 0; i <= h.length; i++) {
    int cur = i == h.length ? 0 : h[i];
    while (!st.isEmpty() && cur < h[st.peek()]) {
        int height = h[st.pop()];
        int left = st.isEmpty() ? -1 : st.peek();
        best = Math.max(best, height * (i - left - 1));
    }
    st.push(i);
}
return best;
```

**Complexity:** O(n) time, O(n) space.
