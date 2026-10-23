# 333. Remove Nth Node From End of List

**Question:** Remove the nth node from the end of a linked list in one pass.

**Answer:** Advance a fast pointer n steps ahead, then move both until fast reaches the end.

```java
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode fast = dummy, slow = dummy;
for (int i = 0; i < n; i++) fast = fast.next;
while (fast.next != null) { fast = fast.next; slow = slow.next; }
slow.next = slow.next.next;
return dummy.next;
```

**Complexity:** O(n) time, O(1) space.
