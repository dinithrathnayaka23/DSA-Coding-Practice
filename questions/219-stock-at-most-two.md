# 219. Stock Trading With At Most Two Transactions

**Question:** Maximize profit with at most two complete transactions.

**Answer:** Maintain four states: first buy, first sell, second buy, and second sell.

```java
int buy1 = Integer.MIN_VALUE, sell1 = 0, buy2 = Integer.MIN_VALUE, sell2 = 0; for (int price : prices) { buy1 = Math.max(buy1, -price); sell1 = Math.max(sell1, buy1 + price); buy2 = Math.max(buy2, sell1 - price); sell2 = Math.max(sell2, buy2 + price); } return sell2;
```

**Complexity:** O(n) time, O(1) space.
