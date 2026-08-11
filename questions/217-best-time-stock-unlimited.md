# 217. Best Time to Buy and Sell Stock II

**Question:** Maximize profit with unlimited transactions but no simultaneous holdings.

**Answer:** Collect every positive day-to-day increase.

```java
int profit = 0; for (int i = 1; i < prices.length; i++) if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1]; return profit;
```

**Complexity:** O(n) time, O(1) space.
