# 285. Longest Consecutive Sequence

**Question:** Find the longest run of consecutive integers in an unsorted array.

**Answer:** Start counting only at values whose predecessor is absent from a set.

```java
Set<Integer> values = Arrays.stream(nums).boxed().collect(Collectors.toSet()); int best = 0; for (int value : values) if (!values.contains(value - 1)) { int current = value; while (values.contains(current)) current++; best = Math.max(best, current - value); } return best;
```

**Complexity:** O(n) average time, O(n) space.
