# 042. Min Stack

**Question:** Design a stack supporting `push`, `pop`, `top`, and minimum value in O(1).

**Answer:** Store each value with the minimum seen at that stack depth.

```java
record Entry(int value, int minimum) {}
Deque<Entry> stack = new ArrayDeque<>();
void push(int value) { stack.push(new Entry(value, Math.min(value, getMin()))); }
int getMin() { return stack.isEmpty() ? Integer.MAX_VALUE : stack.peek().minimum(); }
```

**Complexity:** O(1) per operation, O(n) space.
