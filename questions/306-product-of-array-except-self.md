# 306. Product of Array Except Self

**Question:** Return an array where each element is the product of all other elements, without division.

**Answer:** Build prefix products left to right, then multiply by suffix products right to left.

```java
int n = nums.length;
int[] res = new int[n];
res[0] = 1;
for (int i = 1; i < n; i++) res[i] = res[i - 1] * nums[i - 1];
int suffix = 1;
for (int i = n - 1; i >= 0; i--) {
    res[i] *= suffix;
    suffix *= nums[i];
}
return res;
```

**Complexity:** O(n) time, O(1) extra space.
