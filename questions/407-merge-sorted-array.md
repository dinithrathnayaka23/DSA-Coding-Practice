# 407. Merge Sorted Array

**Question:** Merge sorted nums2 into sorted nums1, which has trailing space, in place.

**Answer:** Fill nums1 from the back with the larger of the two tails.

```java
int i = m - 1, j = n - 1, k = m + n - 1;
while (j >= 0)
    nums1[k--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
```

**Complexity:** O(m + n) time, O(1) space.
