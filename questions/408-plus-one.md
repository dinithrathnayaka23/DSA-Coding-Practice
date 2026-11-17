# 408. Plus One

**Question:** Add one to a number stored as an array of digits.

**Answer:** Walk from the end; a digit below 9 stops the carry, otherwise it becomes 0.

```java
for (int i = d.length - 1; i >= 0; i--) {
    if (d[i] < 9) { d[i]++; return d; }
    d[i] = 0;
}
int[] res = new int[d.length + 1];
res[0] = 1;
return res;
```

**Complexity:** O(n) time, O(1) extra space.
