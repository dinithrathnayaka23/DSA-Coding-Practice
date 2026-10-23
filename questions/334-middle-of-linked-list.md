# 334. Middle of the Linked List

**Question:** Return the middle node of a linked list (the second middle if there are two).

**Answer:** When the fast pointer moves two steps per slow step, slow ends at the middle.

```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
return slow;
```

**Complexity:** O(n) time, O(1) space.
