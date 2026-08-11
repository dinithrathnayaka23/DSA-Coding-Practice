# 173. Combination Sum II

**Question:** Find unique combinations that use each candidate at most once.

**Answer:** Sort candidates and skip equal values at the same recursion depth.

```java
Arrays.sort(candidates); void build(int start, int remaining) { if (remaining == 0) { answer.add(new ArrayList<>(path)); return; } for (int i = start; i < candidates.length && candidates[i] <= remaining; i++) { if (i > start && candidates[i] == candidates[i - 1]) continue; path.add(candidates[i]); build(i + 1, remaining - candidates[i]); path.remove(path.size() - 1); } }
```

**Complexity:** Exponential in the number of candidates, O(n) recursion space.
