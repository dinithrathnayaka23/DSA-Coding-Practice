# 221. Lemonade Change

**Question:** Decide whether exact change can be given for every customer paying with 5, 10, or 20.

**Answer:** Keep counts of five- and ten-dollar bills and use larger bills only when necessary.

```java
int five = 0, ten = 0; for (int bill : bills) { if (bill == 5) five++; else if (bill == 10) { if (five-- == 0) return false; ten++; } else if (ten > 0 && five > 0) { ten--; five--; } else if (five >= 3) five -= 3; else return false; } return true;
```

**Complexity:** O(n) time, O(1) space.
