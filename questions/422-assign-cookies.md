# 422. Assign Cookies

**Question:** Maximize the number of children content, each needing a minimum cookie size and getting at most one cookie.

**Answer:** Sort both; give each cookie to the least greedy child it satisfies.

```java
Arrays.sort(g);
Arrays.sort(s);
int child = 0;
for (int cookie : s)
    if (child < g.length && g[child] <= cookie) child++;
return child;
```

**Complexity:** O(n log n + m log m) time, O(1) extra space.
