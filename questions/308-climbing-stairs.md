# 308. Climbing Stairs

**Question:** Count the distinct ways to climb n stairs taking 1 or 2 steps at a time.

**Answer:** The count follows the Fibonacci recurrence ways(n) = ways(n-1) + ways(n-2).

```java
int a = 1, b = 1;
for (int i = 2; i <= n; i++) {
    int c = a + b;
    a = b;
    b = c;
}
return b;
```

**Complexity:** O(n) time, O(1) space.
