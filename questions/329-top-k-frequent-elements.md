# 329. Top K Frequent Elements

**Question:** Return the k most frequent values in an array.

**Answer:** Count frequencies, then keep a min-heap of size k.

```java
Map<Integer, Integer> cnt = new HashMap<>();
for (int x : nums) cnt.merge(x, 1, Integer::sum);
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> cnt.get(a) - cnt.get(b));
for (int x : cnt.keySet()) {
    pq.add(x);
    if (pq.size() > k) pq.poll();
}
int[] res = new int[k];
for (int i = k - 1; i >= 0; i--) res[i] = pq.poll();
return res;
```

**Complexity:** O(n log k) time, O(n) space.
