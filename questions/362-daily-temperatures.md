# 362. Daily Temperatures

**Question:** For each day, find how many days until a warmer temperature.

**Answer:** Monotonic decreasing stack of indices; pop while the current day is warmer.

```java
int[] res = new int[t.length];
Deque<Integer> st = new ArrayDeque<>();
for (int i = 0; i < t.length; i++) {
    while (!st.isEmpty() && t[i] > t[st.peek()]) {
        int j = st.pop();
        res[j] = i - j;
    }
    st.push(i);
}
return res;
```

**Complexity:** O(n) time, O(n) space.
