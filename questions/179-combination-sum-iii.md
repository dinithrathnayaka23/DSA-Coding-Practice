# 179. Combination Sum III

**Question:** Choose `k` distinct digits from 1 through 9 that sum to `n`.

**Answer:** Backtrack with increasing candidates and prune when the remaining sum is negative.

```java
void build(int next, int count, int sum) { if (count == 0) { if (sum == 0) answer.add(new ArrayList<>(path)); return; } for (int value = next; value <= 9 && value <= sum; value++) { path.add(value); build(value + 1, count - 1, sum - value); path.remove(path.size() - 1); } }
```

**Complexity:** O(C(9,k) · k) time, O(k) recursion space.
