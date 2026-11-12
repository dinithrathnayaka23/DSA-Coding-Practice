# 378. Clone Graph

**Question:** Deep copy an undirected connected graph.

**Answer:** DFS with a map from original node to clone.

```java
Map<Node, Node> seen = new HashMap<>();
Node clone(Node n) {
    if (n == null) return null;
    if (seen.containsKey(n)) return seen.get(n);
    Node c = new Node(n.val);
    seen.put(n, c);
    for (Node nb : n.neighbors) c.neighbors.add(clone(nb));
    return c;
}
```

**Complexity:** O(V + E) time and space.
