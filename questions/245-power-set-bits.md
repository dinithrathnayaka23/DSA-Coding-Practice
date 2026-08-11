# 245. Power Set With Bitmasks

**Question:** Generate all subsets using integer masks.

**Answer:** Bit `i` decides whether item `i` belongs to a subset.

```java
for (int mask = 0; mask < (1 << nums.length); mask++) { List<Integer> subset = new ArrayList<>(); for (int i = 0; i < nums.length; i++) if ((mask & (1 << i)) != 0) subset.add(nums[i]); answer.add(subset); }
```

**Complexity:** O(n · 2^n) time, O(n · 2^n) output space.
