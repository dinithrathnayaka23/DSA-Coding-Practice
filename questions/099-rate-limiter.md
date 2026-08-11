# 099. Token Bucket Rate Limiter

**Question:** Allow at most a fixed number of requests while permitting controlled bursts.

**Answer:** Refill tokens according to elapsed time, cap at capacity, and spend one token per accepted request.

```java
synchronized boolean allow() {
    long now = System.nanoTime();
    tokens = Math.min(capacity, tokens + (now - last) * refillPerNano);
    last = now;
    if (tokens < 1) return false;
    tokens--; return true;
}
```

**Complexity:** O(1) per request, O(1) space. Use a monotonic clock and protect shared state.
