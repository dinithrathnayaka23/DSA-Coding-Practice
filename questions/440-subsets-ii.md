# 440. Subsets II

**Question:** Return all subsets of an array that may contain duplicates, without duplicate subsets.

**Answer:** Sort, then skip a value equal to the previous one at the same recursion level.

```java
void dfs(int[] a, int start, List<Integer> cur, List<List<Integer>> res) {
    res.add(new ArrayList<>(cur));
    for (int i = start; i < a.length; i++) {
        if (i > start && a[i] == a[i - 1]) continue;
        cur.add(a[i]);
        dfs(a, i + 1, cur, res);
        cur.remove(cur.size() - 1);
    }
}
// sort the array first
```

**Complexity:** O(n · 2ⁿ) time, O(n) recursion space.
