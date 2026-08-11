# 111. Increasing Triplet Subsequence

**Question:** Decide whether an array contains indices `i < j < k` with increasing values.

**Answer:** Keep the smallest and second-smallest candidates seen so far.

```java
int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
for (int value : nums) { if (value <= first) first = value; else if (value <= second) second = value; else return true; }
return false;
```

**Complexity:** O(n) time, O(1) space.
