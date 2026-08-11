# 139. Subsets With Duplicates

**Question:** Generate unique subsets when the input can contain duplicates.

**Answer:** Sort first and, at each depth, skip a value equal to the previous value.

```java
Arrays.sort(nums);
void build(int start, List<Integer> current) { answer.add(new ArrayList<>(current)); for (int i = start; i < nums.length; i++) { if (i > start && nums[i] == nums[i - 1]) continue; current.add(nums[i]); build(i + 1, current); current.remove(current.size() - 1); } }
```

**Complexity:** O(n · 2^n) worst-case time, O(n) recursion space.
