# 035. Merge Two Sorted Lists

**Question:** Merge two ascending linked lists into one ascending list.

**Answer:** Attach the smaller current node to a dummy tail until one list ends, then append the remainder.

```java
Node dummy = new Node(0), tail = dummy;
while (a != null && b != null) {
    if (a.value <= b.value) { tail.next = a; a = a.next; }
    else { tail.next = b; b = b.next; }
    tail = tail.next;
}
tail.next = a != null ? a : b;
return dummy.next;
```

**Complexity:** O(n + m) time, O(1) extra space.
