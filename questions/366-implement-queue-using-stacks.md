# 366. Implement Queue Using Stacks

**Question:** Build a FIFO queue using only two stacks.

**Answer:** Push to an input stack; move to an output stack only when output is empty.

```java
Deque<Integer> in = new ArrayDeque<>(), out = new ArrayDeque<>();
void push(int x) { in.push(x); }
int pop() { peek(); return out.pop(); }
int peek() {
    if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop());
    return out.peek();
}
boolean empty() { return in.isEmpty() && out.isEmpty(); }
```

**Complexity:** O(1) amortized per operation, O(n) space.
