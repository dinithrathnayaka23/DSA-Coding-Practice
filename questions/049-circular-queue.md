# 049. Design a Circular Queue

**Question:** Design a fixed-capacity queue that reuses freed array positions.

**Answer:** Advance front and rear modulo capacity and track the current size separately.

```java
boolean offer(int value) {
    if (size == data.length) return false;
    data[rear] = value; rear = (rear + 1) % data.length; size++; return true;
}
int poll() {
    if (size == 0) return -1;
    int value = data[front]; front = (front + 1) % data.length; size--; return value;
}
```

**Complexity:** O(1) per operation, O(capacity) space.
