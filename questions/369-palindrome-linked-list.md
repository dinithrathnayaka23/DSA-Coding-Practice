# 369. Palindrome Linked List

**Question:** Check whether a linked list reads the same forwards and backwards.

**Answer:** Find the middle, reverse the second half, and compare both halves.

```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
ListNode prev = null;
while (slow != null) { ListNode nx = slow.next; slow.next = prev; prev = slow; slow = nx; }
while (prev != null) {
    if (prev.val != head.val) return false;
    prev = prev.next; head = head.next;
}
return true;
```

**Complexity:** O(n) time, O(1) space.
