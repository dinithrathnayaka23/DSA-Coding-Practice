# 330. Reverse Linked List

**Question:** Reverse a singly linked list.

**Answer:** Walk the list re-pointing each node's next at the previous node.

```java
ListNode prev = null;
while (head != null) {
    ListNode next = head.next;
    head.next = prev;
    prev = head;
    head = next;
}
return prev;
```

**Complexity:** O(n) time, O(1) space.
