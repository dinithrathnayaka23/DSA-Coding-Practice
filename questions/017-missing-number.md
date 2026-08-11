# 017. Missing Number

**Question:** An array contains distinct values from `0` through `n` except one. Find the missing value.

**Answer:** XOR cancels every value that appears twice, leaving the missing number.

```java
int answer = nums.length;
for (int i = 0; i < nums.length; i++) answer ^= i ^ nums[i];
return answer;
```

**Complexity:** O(n) time, O(1) space.
