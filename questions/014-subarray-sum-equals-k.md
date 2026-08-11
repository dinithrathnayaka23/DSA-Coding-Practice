# 014. Subarray Sum Equals K

**Question:** Count contiguous subarrays whose sum equals `k`.

**Answer:** If the current prefix sum is `p`, every earlier prefix `p - k` starts a valid subarray.

```java
Map<Integer, Integer> frequency = new HashMap<>();
frequency.put(0, 1);
int prefix = 0, answer = 0;
for (int value : nums) {
    prefix += value;
    answer += frequency.getOrDefault(prefix - k, 0);
    frequency.put(prefix, frequency.getOrDefault(prefix, 0) + 1);
}
return answer;
```

**Complexity:** O(n) time, O(n) space.
