# 218. Stock Trading With Transaction Fee

**Question:** Maximize stock profit when every sale pays a fixed fee.

**Answer:** DP tracks the best cash without stock and the best value while holding stock.

```java
int cash = 0, hold = -prices[0]; for (int price : prices) { int oldCash = cash; cash = Math.max(cash, hold + price - fee); hold = Math.max(hold, oldCash - price); } return cash;
```

**Complexity:** O(n) time, O(1) space.
