# 332. Merge Two Sorted Lists

**Question:** Merge two sorted linked lists into one sorted list.

**Answer:** Use a dummy head and always append the smaller front node.

```java
ListNode dummy = new ListNode(0), tail = dummy;
while (a != null && b != null) {
    if (a.val <= b.val) { tail.next = a; a = a.next; }
    else { tail.next = b; b = b.next; }
    tail = tail.next;
}
tail.next = a != null ? a : b;
return dummy.next;
```

**Complexity:** O(n + m) time, O(1) space.
