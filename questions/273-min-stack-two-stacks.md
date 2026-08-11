# 273. Min Stack With Two Stacks

**Question:** Support minimum retrieval in O(1) using two stacks.

**Answer:** Push a value onto the minimum stack whenever it is no larger than the current minimum.

```java
void push(int value) { values.push(value); if (mins.isEmpty() || value <= mins.peek()) mins.push(value); }
int pop() { int value = values.pop(); if (value == mins.peek()) mins.pop(); return value; }
```

**Complexity:** O(1) operations, O(n) space.
