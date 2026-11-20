# 432. Min Cost Climbing Stairs

**Question:** Find the minimum cost to reach the top when you may start at step 0 or 1 and climb 1 or 2 steps.

**Answer:** The cost to stand on step i is cost[i] plus the cheaper of the two previous steps.

```java
int a = 0, b = 0;
for (int i = 2; i <= cost.length; i++) {
    int c = Math.min(b + cost[i - 1], a + cost[i - 2]);
    a = b;
    b = c;
}
return b;
```

**Complexity:** O(n) time, O(1) space.
