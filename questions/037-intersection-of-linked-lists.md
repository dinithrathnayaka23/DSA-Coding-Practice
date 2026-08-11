# 037. Intersection of Linked Lists

**Question:** Find the first node shared by two singly linked lists.

**Answer:** When a pointer reaches the end of one list, move it to the other head; both then travel equal total distances.

```java
Node a = headA, b = headB;
while (a != b) { a = a == null ? headB : a.next; b = b == null ? headA : b.next; }
return a;
```

**Complexity:** O(n + m) time, O(1) space.
