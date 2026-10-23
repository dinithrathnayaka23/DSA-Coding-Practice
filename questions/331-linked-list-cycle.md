# 331. Linked List Cycle

**Question:** Detect whether a linked list contains a cycle.

**Answer:** Floyd's tortoise and hare: a fast pointer eventually meets the slow one inside a cycle.

```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) return true;
}
return false;
```

**Complexity:** O(n) time, O(1) space.
