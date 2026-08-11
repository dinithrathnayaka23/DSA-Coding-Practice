# 151. LRU Cache With a Doubly Linked List

**Question:** Implement an LRU cache without relying on `LinkedHashMap`.

**Answer:** Combine a hash map for lookup with a doubly linked list ordered from most to least recent.

```java
void touch(Node node) { remove(node); addAfterHead(node); }
int get(int key) { Node node = map.get(key); if (node == null) return -1; touch(node); return node.value; }
```

**Complexity:** O(1) average get and put, O(capacity) space.
