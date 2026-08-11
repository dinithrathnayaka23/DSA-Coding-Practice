# 002. Best Time to Buy and Sell Stock

**Question:** Find the maximum profit from one buy followed by one sell.

**Answer:** Track the smallest price seen and the best profit ending today.

```java
int min = Integer.MAX_VALUE, best = 0;
for (int price : prices) {
    min = Math.min(min, price);
    best = Math.max(best, price - min);
}
return best;
```

**Complexity:** O(n) time, O(1) space.
