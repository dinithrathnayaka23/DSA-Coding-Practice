# 441. Combination Sum II

**Question:** Find unique combinations that sum to a target where each candidate is used at most once.

**Answer:** Sort, move to i + 1 after choosing, and skip duplicate values at the same level.

```java
void dfs(int[] c, int start, int rem, List<Integer> cur, List<List<Integer>> res) {
    if (rem == 0) { res.add(new ArrayList<>(cur)); return; }
    for (int i = start; i < c.length && c[i] <= rem; i++) {
        if (i > start && c[i] == c[i - 1]) continue;
        cur.add(c[i]);
        dfs(c, i + 1, rem - c[i], cur, res);
        cur.remove(cur.size() - 1);
    }
}
// sort candidates first
```

**Complexity:** O(2ⁿ) time, O(n) recursion space.
