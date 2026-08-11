# 062. Clone Graph

**Question:** Make a deep copy of a connected graph with arbitrary cycles.

**Answer:** Map each original node to its clone before recursively cloning neighbors; the map breaks cycles.

```java
Node clone(Node node) {
    if (node == null) return null;
    if (copies.containsKey(node)) return copies.get(node);
    Node copy = new Node(node.value); copies.put(node, copy);
    for (Node neighbor : node.neighbors) copy.neighbors.add(clone(neighbor));
    return copy;
}
```

**Complexity:** O(V + E) time, O(V) space.
