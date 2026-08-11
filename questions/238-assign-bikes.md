# 238. Campus Bikes

**Question:** Assign bikes to workers using minimum Manhattan distance, breaking ties by worker and bike index.

**Answer:** Generate all worker-bike pairs, sort by the tie-breaking rule, and accept unused endpoints.

```java
List<Pair> pairs = allPairs(workers, bikes); pairs.sort(Comparator.comparingInt(Pair::distance).thenComparingInt(Pair::worker).thenComparingInt(Pair::bike)); for (Pair pair : pairs) if (!workerUsed[pair.worker()] && !bikeUsed[pair.bike()]) assign(pair);
```

**Complexity:** O(WB log(WB)) time, O(WB) space.
