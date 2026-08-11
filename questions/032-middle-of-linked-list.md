# 032. Middle of Linked List

**Question:** Return the middle node of a singly linked list.

**Answer:** Move a slow pointer one step and a fast pointer two steps; slow reaches the middle when fast finishes.

```java
Node slow = head, fast = head;
while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
return slow;
```

**Complexity:** O(n) time, O(1) space.
