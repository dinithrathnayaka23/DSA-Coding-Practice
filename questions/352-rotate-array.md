# 352. Rotate Array

**Question:** Rotate an array to the right by k steps in place.

**Answer:** Reverse the whole array, then reverse the first k and the remaining n-k elements.

```java
k %= nums.length;
reverse(nums, 0, nums.length - 1);
reverse(nums, 0, k - 1);
reverse(nums, k, nums.length - 1);

void reverse(int[] a, int l, int r) {
    while (l < r) { int t = a[l]; a[l++] = a[r]; a[r--] = t; }
}
```

**Complexity:** O(n) time, O(1) space.
