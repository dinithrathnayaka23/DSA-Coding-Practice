# 048. Implement Stack Using Queues

**Question:** Implement LIFO stack operations using a queue.

**Answer:** After enqueueing a value, rotate all earlier queue values behind it so the new value is at the front.

```java
void push(int value) {
    queue.offer(value);
    for (int i = 1; i < queue.size(); i++) queue.offer(queue.poll());
}
int pop() { return queue.poll(); }
```

**Complexity:** O(n) push and O(1) pop, O(n) space.
