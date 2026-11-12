# 361. Min Stack

**Question:** Design a stack that supports push, pop, top, and retrieving the minimum in O(1).

**Answer:** Store each value with the minimum seen at or below it.

```java
Deque<int[]> st = new ArrayDeque<>();
void push(int x) { st.push(new int[]{x, st.isEmpty() ? x : Math.min(x, st.peek()[1])}); }
void pop() { st.pop(); }
int top() { return st.peek()[0]; }
int getMin() { return st.peek()[1]; }
```

**Complexity:** O(1) per operation, O(n) space.
