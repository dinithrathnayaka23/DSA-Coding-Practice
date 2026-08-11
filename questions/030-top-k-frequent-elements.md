# 030. Top K Frequent Elements

**Question:** Return the `k` values with the highest frequencies.

**Answer:** Count values and keep a min-heap ordered by frequency, removing the least frequent when it grows beyond `k`.

```java
Map<Integer, Integer> counts = new HashMap<>();
for (int value : nums) counts.merge(value, 1, Integer::sum);
PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(counts::get));
for (int value : counts.keySet()) { heap.offer(value); if (heap.size() > k) heap.poll(); }
return new ArrayList<>(heap);
```

**Complexity:** O(n log k) time, O(n) space.
