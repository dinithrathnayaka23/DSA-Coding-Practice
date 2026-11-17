# 414. Subarray Sum Equals K

**Question:** Count the contiguous subarrays whose sum equals k.

**Answer:** Prefix sums with a map: add the count of earlier prefixes equal to sum - k.

```java
Map<Integer, Integer> cnt = new HashMap<>();
cnt.put(0, 1);
int sum = 0, res = 0;
for (int x : nums) {
    sum += x;
    res += cnt.getOrDefault(sum - k, 0);
    cnt.merge(sum, 1, Integer::sum);
}
return res;
```

**Complexity:** O(n) time, O(n) space.
