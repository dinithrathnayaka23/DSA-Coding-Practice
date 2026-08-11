# 269. Hit Counter

**Question:** Count hits received during the previous five minutes.

**Answer:** Store timestamp/count pairs in a queue and remove entries older than the time window.

```java
void hit(int timestamp) { if (!queue.isEmpty() && queue.peekLast().time() == timestamp) mergeLast(); else queue.offer(new Entry(timestamp, 1)); }
int getHits(int timestamp) { while (!queue.isEmpty() && queue.peekFirst().time() <= timestamp - 300) total -= queue.poll().count(); return total; }
```

**Complexity:** O(1) amortized per operation, O(window) space.
