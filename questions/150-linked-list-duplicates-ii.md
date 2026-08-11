# 150. Remove All Duplicates From Sorted List

**Question:** Remove every value that occurs more than once, leaving only distinct values.

**Answer:** Use a dummy predecessor and skip an entire equal-value run whenever one is detected.

```java
Node dummy = new Node(0); dummy.next = head; Node previous = dummy;
while (head != null) { boolean duplicate = false; while (head.next != null && head.value == head.next.value) { duplicate = true; head = head.next; } if (duplicate) previous.next = head.next; else previous = previous.next; head = head.next; }
return dummy.next;
```

**Complexity:** O(n) time, O(1) space.
