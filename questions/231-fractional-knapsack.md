# 231. Fractional Knapsack

**Question:** Maximize value when fractions of items may be taken.

**Answer:** Sort by value-to-weight ratio and take the highest ratio first.

```java
Arrays.sort(items, (a, b) -> Double.compare((double) b.value() / b.weight(), (double) a.value() / a.weight()); double value = 0; for (Item item : items) { double amount = Math.min(item.weight(), capacity); value += amount * item.value() / item.weight(); capacity -= amount; if (capacity == 0) break; }
```

**Complexity:** O(n log n) time, O(1) extra space.
