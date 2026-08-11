# 280. Sliding-Window Rate Limiter

**Question:** Allow at most `limit` requests in a rolling time window.

**Answer:** Queue request timestamps and remove all entries outside the window before accepting a new request.

```java
boolean allow(long now) { while (!timestamps.isEmpty() && timestamps.peek() <= now - window) timestamps.poll(); if (timestamps.size() == limit) return false; timestamps.offer(now); return true; }
```

**Complexity:** O(1) amortized per request, O(limit) space.
