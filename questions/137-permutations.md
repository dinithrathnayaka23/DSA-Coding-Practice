# 137. Permutations

**Question:** Generate every permutation of distinct values.

**Answer:** Choose each unused value at the next position and backtrack after the recursive call.

```java
void build(List<Integer> current, boolean[] used) { if (current.size() == nums.length) { answer.add(new ArrayList<>(current)); return; }
    for (int i = 0; i < nums.length; i++) if (!used[i]) { used[i] = true; current.add(nums[i]); build(current, used); current.remove(current.size() - 1); used[i] = false; }
}
```

**Complexity:** O(n · n!) time, O(n) recursion space excluding output.
