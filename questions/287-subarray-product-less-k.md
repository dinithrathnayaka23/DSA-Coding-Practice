# 287. Subarray Product Less Than K

**Question:** Count positive-integer subarrays whose product is less than `k`.

**Answer:** Maintain a sliding window product and shrink it until valid.

```java
if (k <= 1) return 0; long product = 1; int left = 0, answer = 0; for (int right = 0; right < nums.length; right++) { product *= nums[right]; while (product >= k) product /= nums[left++]; answer += right - left + 1; } return answer;
```

**Complexity:** O(n) time, O(1) space.
