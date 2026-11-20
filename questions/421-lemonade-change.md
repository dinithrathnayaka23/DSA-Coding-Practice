# 421. Lemonade Change

**Question:** Each customer pays 5, 10, or 20 for a 5 lemonade; decide if you can always give correct change.

**Answer:** Track counts of 5 and 10 bills; prefer giving a 10 plus a 5 for a 20.

```java
int five = 0, ten = 0;
for (int b : bills) {
    if (b == 5) five++;
    else if (b == 10) { if (five == 0) return false; five--; ten++; }
    else if (ten > 0 && five > 0) { ten--; five--; }
    else if (five >= 3) five -= 3;
    else return false;
}
return true;
```

**Complexity:** O(n) time, O(1) space.
