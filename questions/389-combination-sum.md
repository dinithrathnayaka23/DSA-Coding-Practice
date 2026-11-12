# 389. Combination Sum

**Question:** Find all unique combinations of candidates (reusable) that sum to a target.

**Answer:** Backtrack, allowing the same index again, and prune when the remainder goes negative.

```java
void dfs(int[] c, int start, int rem, List<Integer> cur, List<List<Integer>> res) {
    if (rem == 0) { res.add(new ArrayList<>(cur)); return; }
    for (int i = start; i < c.length && c[i] <= rem; i++) {
        cur.add(c[i]);
        dfs(c, i, rem - c[i], cur, res);
        cur.remove(cur.size() - 1);
    }
}
// sort candidates first
```

**Complexity:** O(n^(t/m)) time worst case, O(t/m) recursion space.
