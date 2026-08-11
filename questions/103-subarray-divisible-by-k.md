# 103. Subarray Sums Divisible by K

**Question:** Count subarrays whose sum is divisible by `k`.

**Answer:** Equal prefix-sum remainders define a divisible subarray; count each remainder as it appears.

```java
int[] count = new int[k]; count[0] = 1; int prefix = 0, answer = 0;
for (int value : nums) { prefix = (prefix + value % k + k) % k; answer += count[prefix]++; }
return answer;
```

**Complexity:** O(n) time, O(k) space.
