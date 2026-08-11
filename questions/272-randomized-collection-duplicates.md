# 272. Randomized Collection With Duplicates

**Question:** Extend randomized-set operations so duplicate values are allowed.

**Answer:** Map each value to a set of its array indices and update both index sets after swaps.

```java
indices.computeIfAbsent(value, x -> new HashSet<>()).add(values.size()); values.add(value);
```

**Complexity:** O(1) average operations, O(n) space.
