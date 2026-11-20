# 426. Last Stone Weight

**Question:** Repeatedly smash the two heaviest stones; return the weight of the last remaining stone, or 0.

**Answer:** Use a max-heap and push back the difference after each smash.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
for (int s : stones) pq.add(s);
while (pq.size() > 1) {
    int a = pq.poll(), b = pq.poll();
    if (a != b) pq.add(a - b);
}
return pq.isEmpty() ? 0 : pq.peek();
```

**Complexity:** O(n log n) time, O(n) space.
