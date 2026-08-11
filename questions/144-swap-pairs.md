# 144. Swap Nodes in Pairs

**Question:** Swap every two adjacent linked-list nodes without changing node values.

**Answer:** Use a dummy node and reconnect each pair around the dummy tail.

```java
Node dummy = new Node(0); dummy.next = head; Node previous = dummy;
while (previous.next != null && previous.next.next != null) { Node first = previous.next, second = first.next; first.next = second.next; second.next = first; previous.next = second; previous = first; }
return dummy.next;
```

**Complexity:** O(n) time, O(1) space.
