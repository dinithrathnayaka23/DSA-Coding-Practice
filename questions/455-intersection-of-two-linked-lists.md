# 455. Intersection of Two Linked Lists

**Question:** Return the node where two singly linked lists intersect, or null.

**Answer:** Two pointers switch to the other list's head at the end; they meet at the intersection after equal total steps.

```java
ListNode a = headA, b = headB;
while (a != b) {
    a = a == null ? headB : a.next;
    b = b == null ? headA : b.next;
}
return a;
```

**Complexity:** O(n + m) time, O(1) space.
