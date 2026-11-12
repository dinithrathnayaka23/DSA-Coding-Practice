# 370. Reorder List

**Question:** Reorder L0 -> L1 -> ... -> Ln into L0 -> Ln -> L1 -> Ln-1 -> ... in place.

**Answer:** Split at the middle, reverse the second half, then interleave the two halves.

```java
ListNode slow = head, fast = head;
while (fast.next != null && fast.next.next != null) { slow = slow.next; fast = fast.next.next; }
ListNode second = slow.next, prev = null;
slow.next = null;
while (second != null) { ListNode nx = second.next; second.next = prev; prev = second; second = nx; }
ListNode first = head;
while (prev != null) {
    ListNode a = first.next, b = prev.next;
    first.next = prev; prev.next = a;
    first = a; prev = b;
}
```

**Complexity:** O(n) time, O(1) space.
