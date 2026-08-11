# 283. Merge K Sorted Lists

**Question:** Merge `k` sorted linked lists into one sorted list.

**Answer:** A min-heap always exposes the smallest current head and then adds its successor.

```java
PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.value)); for (Node list : lists) if (list != null) queue.offer(list); Node dummy = new Node(0), tail = dummy; while (!queue.isEmpty()) { tail.next = queue.poll(); tail = tail.next; if (tail.next != null) queue.offer(tail.next); } return dummy.next;
```

**Complexity:** O(N log k) time, O(k) space.
