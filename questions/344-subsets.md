# 344. Subsets

**Question:** Return every subset of an array of distinct integers.

**Answer:** Backtrack: at each index choose to include the element or not.

```java
void backtrack(int[] nums, int start, List<Integer> cur, List<List<Integer>> res) {
    res.add(new ArrayList<>(cur));
    for (int i = start; i < nums.length; i++) {
        cur.add(nums[i]);
        backtrack(nums, i + 1, cur, res);
        cur.remove(cur.size() - 1);
    }
}
```

**Complexity:** O(n · 2ⁿ) time, O(n) recursion space.
