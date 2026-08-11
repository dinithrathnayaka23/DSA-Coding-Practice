# 180. Permutations With Duplicates

**Question:** Generate unique permutations when an array contains repeated values.

**Answer:** Sort first and skip an equal unused value if its previous copy has not been used at this depth.

```java
Arrays.sort(nums); void build() { if (path.size() == nums.length) { answer.add(new ArrayList<>(path)); return; } for (int i = 0; i < nums.length; i++) if (!used[i] && (i == 0 || nums[i] != nums[i - 1] || used[i - 1])) { used[i] = true; path.add(nums[i]); build(); path.remove(path.size() - 1); used[i] = false; } }
```

**Complexity:** O(n · n!) worst-case time, O(n) auxiliary space.
