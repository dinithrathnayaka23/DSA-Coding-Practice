# 074. Longest Increasing Subsequence

**Question:** Find the length of the longest strictly increasing subsequence.

**Answer:** Maintain the smallest possible tail for every subsequence length and binary-search its replacement position.

```java
int length = 0;
for (int value : nums) {
    int position = Arrays.binarySearch(tails, 0, length, value);
    if (position < 0) position = -position - 1;
    tails[position] = value; if (position == length) length++;
}
return length;
```

**Complexity:** O(n log n) time, O(n) space.
