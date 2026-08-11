# 001. Two Sum

**Question:** Return the indices of two values whose sum equals a target.

**Answer:** Store each value's index in a map and look up `target - value` before inserting the current value.

```java
Map<Integer, Integer> seen = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    if (seen.containsKey(target - nums[i])) return new int[]{seen.get(target - nums[i]), i};
    seen.put(nums[i], i);
}
return new int[0];
```

**Complexity:** O(n) time, O(n) space.
