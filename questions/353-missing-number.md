# 353. Missing Number

**Question:** Given n distinct numbers from 0 to n, find the one that is missing.

**Answer:** The expected sum n(n+1)/2 minus the actual sum is the missing value.

```java
int n = nums.length;
int sum = n * (n + 1) / 2;
for (int x : nums) sum -= x;
return sum;
```

**Complexity:** O(n) time, O(1) space.
