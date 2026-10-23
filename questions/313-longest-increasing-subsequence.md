# 313. Longest Increasing Subsequence

**Question:** Return the length of the longest strictly increasing subsequence.

**Answer:** Keep a tails array and binary search the slot each number replaces or extends.

```java
int[] tails = new int[nums.length];
int size = 0;
for (int x : nums) {
    int i = Arrays.binarySearch(tails, 0, size, x);
    if (i < 0) i = -(i + 1);
    tails[i] = x;
    if (i == size) size++;
}
return size;
```

**Complexity:** O(n log n) time, O(n) space.
