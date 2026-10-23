# 345. Permutations

**Question:** Return all permutations of an array of distinct integers.

**Answer:** Backtrack by swapping each remaining element into the current position.

```java
void permute(int[] a, int k, List<List<Integer>> res) {
    if (k == a.length) {
        List<Integer> p = new ArrayList<>();
        for (int x : a) p.add(x);
        res.add(p);
        return;
    }
    for (int i = k; i < a.length; i++) {
        int t = a[k]; a[k] = a[i]; a[i] = t;
        permute(a, k + 1, res);
        t = a[k]; a[k] = a[i]; a[i] = t;
    }
}
```

**Complexity:** O(n · n!) time, O(n) recursion space.
