# 260. Ugly Number

**Question:** Decide whether a positive number has no prime factors other than 2, 3, and 5.

**Answer:** Repeatedly divide by those allowed factors and check whether one remains.

```java
for (int factor : new int[]{2, 3, 5}) while (number % factor == 0) number /= factor; return number == 1;
```

**Complexity:** O(log n) time, O(1) space.
