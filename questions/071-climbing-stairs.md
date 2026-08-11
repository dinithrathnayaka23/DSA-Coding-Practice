# 071. Climbing Stairs

**Question:** Count ways to reach step `n` when each move is one or two steps.

**Answer:** The last move comes from `n - 1` or `n - 2`, giving a Fibonacci recurrence.

```java
int one = 1, two = 1;
for (int step = 2; step <= n; step++) { int next = one + two; two = one; one = next; }
return one;
```

**Complexity:** O(n) time, O(1) space.
