# 237. Gas Station Starting Point Proof

**Question:** Explain why the greedy gas-station start is correct.

**Answer:** If a segment from the current start first drops below zero, every station inside that segment also fails as a start, so the next station is the only possible candidate.

```java
if (running < 0) { start = index + 1; running = 0; }
```

**Complexity:** O(n) time, O(1) space.
