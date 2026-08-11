# 149. Remove Duplicates From Sorted List

**Question:** Remove duplicate values from a sorted linked list.

**Answer:** When adjacent values match, bypass the second node; otherwise advance.

```java
for (Node current = head; current != null && current.next != null;) { if (current.value == current.next.value) current.next = current.next.next; else current = current.next; }
return head;
```

**Complexity:** O(n) time, O(1) space.
