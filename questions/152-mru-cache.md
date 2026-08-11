# 152. MRU Cache

**Question:** Design a cache that evicts the most recently used item when full.

**Answer:** Track access order with a doubly linked list and remove from the front instead of the back.

```java
void access(Node node) { unlink(node); linkAtFront(node); }
Node evicted = head.next; unlink(evicted); map.remove(evicted.key);
```

**Complexity:** O(1) average operations, O(capacity) space.
