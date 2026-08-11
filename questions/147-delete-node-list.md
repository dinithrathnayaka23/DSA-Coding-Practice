# 147. Delete a Node Given Only That Node

**Question:** Delete a non-tail list node when the head is unavailable.

**Answer:** Copy the next node's value into this node and bypass the next node.

```java
node.value = node.next.value; node.next = node.next.next;
```

**Complexity:** O(1) time, O(1) space.
