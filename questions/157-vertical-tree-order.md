# 157. Vertical Order Traversal

**Question:** Group tree nodes by their horizontal column.

**Answer:** BFS carries each node's column, using a sorted map from column to values.

```java
Queue<State> queue = new ArrayDeque<>(); queue.offer(new State(root, 0));
while (!queue.isEmpty()) { State state = queue.poll(); columns.computeIfAbsent(state.column(), x -> new ArrayList<>()).add(state.node().value); if (state.node().left != null) queue.offer(new State(state.node().left, state.column() - 1)); if (state.node().right != null) queue.offer(new State(state.node().right, state.column() + 1)); }
```

**Complexity:** O(n log n) time with a sorted map, O(n) space.
