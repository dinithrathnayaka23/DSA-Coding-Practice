# 215. Palindrome Partitioning Minimum Cuts

**Question:** Find the minimum cuts needed to partition a string into palindromes.

**Answer:** Expand palindromes around each center and update the minimum cut for the ending index.

```java
int[] cuts = new int[n]; for (int i = 0; i < n; i++) cuts[i] = i;
for (int center = 0; center < n; center++) { expandCuts(center, center, cuts); expandCuts(center, center + 1, cuts); }
return cuts[n - 1];
```

**Complexity:** O(n²) time, O(n) space.
