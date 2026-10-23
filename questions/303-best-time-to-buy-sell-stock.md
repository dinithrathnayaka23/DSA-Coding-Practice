# 303. Best Time to Buy and Sell Stock

**Question:** Given daily prices, find the maximum profit from one buy followed by one sell.

**Answer:** Track the minimum price so far and the best difference against it.

```java
int min = Integer.MAX_VALUE, best = 0;
for (int p : prices) {
    min = Math.min(min, p);
    best = Math.max(best, p - min);
}
return best;
```

**Complexity:** O(n) time, O(1) space.
