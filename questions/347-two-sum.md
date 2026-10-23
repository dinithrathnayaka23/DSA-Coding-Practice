# 347. Two Sum

**Question:** Return the indices of the two numbers in an array that add up to a target.

**Answer:** Store each value's index in a map and look up the complement as you scan.

```java
Map<Integer, Integer> idx = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    Integer j = idx.get(target - nums[i]);
    if (j != null) return new int[]{j, i};
    idx.put(nums[i], i);
}
return new int[0];
```

**Complexity:** O(n) time, O(n) space.
