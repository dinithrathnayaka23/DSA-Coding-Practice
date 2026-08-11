# 047. Implement Queue Using Stacks

**Question:** Implement FIFO queue operations using stacks.

**Answer:** Push new values onto `in`; when `out` is empty, transfer all values from `in` to `out`.

```java
void enqueue(int value) { in.push(value); }
int dequeue() { moveIfNeeded(); return out.pop(); }
void moveIfNeeded() { if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop()); }
```

**Complexity:** O(1) amortized per operation, O(n) space.
