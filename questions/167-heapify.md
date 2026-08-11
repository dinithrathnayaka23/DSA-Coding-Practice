# 167. Build a Heap

**Question:** Convert an unsorted array into a min-heap in place.

**Answer:** Sift down every internal node from the last parent to the root.

```java
for (int i = nums.length / 2 - 1; i >= 0; i--) siftDown(nums, i, nums.length);
```

**Complexity:** O(n) time, O(1) space.
