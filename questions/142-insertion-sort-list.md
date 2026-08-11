# 142. Insertion Sort List

**Question:** Sort a linked list using insertion sort.

**Answer:** Insert each node into its correct position in a sorted prefix headed by a dummy node.

```java
Node dummy = new Node(Integer.MIN_VALUE);
for (Node current = head; current != null;) { Node next = current.next, scan = dummy; while (scan.next != null && scan.next.value < current.value) scan = scan.next; current.next = scan.next; scan.next = current; current = next; }
return dummy.next;
```

**Complexity:** O(n²) time, O(1) space.
