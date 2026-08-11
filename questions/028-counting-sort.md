# 028. Counting Sort

**Question:** Sort non-negative integers when their value range is small.

**Answer:** Count each value, then overwrite the input in increasing value order.

```java
int[] count = new int[maxValue + 1];
for (int value : nums) count[value]++;
int write = 0;
for (int value = 0; value < count.length; value++)
    while (count[value]-- > 0) nums[write++] = value;
```

**Complexity:** O(n + range) time, O(range) space.
