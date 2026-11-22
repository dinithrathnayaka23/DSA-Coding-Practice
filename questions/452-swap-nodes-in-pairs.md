# 452. Swap Nodes in Pairs

**Question:** Swap every two adjacent nodes of a linked list by relinking nodes.

**Answer:** Use a dummy head and rewire each pair using a trailing pointer.

```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode prev = dummy;
while (prev.next != null && prev.next.next != null) {
    ListNode a = prev.next, b = a.next;
    a.next = b.next;
    b.next = a;
    prev.next = b;
    prev = a;
}
return dummy.next;
```

**Complexity:** O(n) time, O(1) space.
