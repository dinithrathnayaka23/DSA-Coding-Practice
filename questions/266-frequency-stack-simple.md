# 266. Frequency Stack With Buckets

**Question:** Pop the most frequent value, using recency to break ties.

**Answer:** A map from frequency to a stack preserves both priority rules.

```java
int frequency = counts.merge(value, 1, Integer::sum); buckets.computeIfAbsent(frequency, x -> new ArrayDeque<>()).push(value); maximum = Math.max(maximum, frequency);
```

**Complexity:** O(1) average per operation, O(n) space.
