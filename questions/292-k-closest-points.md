# 292. K Closest Points to Origin

**Question:** Return the `k` points with smallest squared Euclidean distance.

**Answer:** Maintain a max-heap of size `k`, removing the farthest retained point.

```java
PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(distance(b), distance(a))); for (int[] point : points) { heap.offer(point); if (heap.size() > k) heap.poll(); } return heap.toArray(new int[0][]);
```

**Complexity:** O(n log k) time, O(k) space.
