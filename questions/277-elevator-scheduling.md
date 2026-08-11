# 277. Elevator Scheduling

**Question:** Choose the next elevator request using a deterministic scheduling policy.

**Answer:** A priority queue ordered by direction, distance, and request time makes selection explicit and testable.

```java
PriorityQueue<Request> requests = new PriorityQueue<>(Comparator.comparingInt(Request::priority).thenComparingLong(Request::time));
Request nextRequest() { return requests.poll(); }
```

**Complexity:** O(log n) insertion/removal, O(n) queued requests.
