# 140. Combination Sum

**Question:** Find combinations of reusable candidates whose sum equals a target.

**Answer:** Backtrack with a start index so combinations stay non-decreasing and avoid duplicates.

```java
void build(int start, int remaining, List<Integer> current) { if (remaining == 0) { answer.add(new ArrayList<>(current)); return; }
    for (int i = start; i < candidates.length && candidates[i] <= remaining; i++) { current.add(candidates[i]); build(i, remaining - candidates[i], current); current.remove(current.size() - 1); }
}
```

**Complexity:** Exponential in the target in the worst case, O(target) recursion depth.
