# 033. Detect Cycle in a Linked List

**Question:** Determine whether a linked list contains a cycle.

**Answer:** If slow and fast pointers ever meet, the list has a cycle.

```java
Node slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next; fast = fast.next.next;
    if (slow == fast) return true;
}
return false;
```

**Complexity:** O(n) time, O(1) space.
