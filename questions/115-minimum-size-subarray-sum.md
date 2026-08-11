# 115. Minimum Size Subarray Sum

**Question:** Find the shortest positive-integer subarray with sum at least a target.

**Answer:** Expand a sliding window, then shrink it while it still satisfies the target.

```java
int left = 0, sum = 0, answer = Integer.MAX_VALUE;
for (int right = 0; right < nums.length; right++) { sum += nums[right];
    while (sum >= target) { answer = Math.min(answer, right - left + 1); sum -= nums[left++]; }
}
return answer == Integer.MAX_VALUE ? 0 : answer;
```

**Complexity:** O(n) time, O(1) space.
