# 040. Reorder List

**Question:** Transform `L0 → L1 → ... → Ln` into `L0 → Ln → L1 → Ln-1 ...`.

**Answer:** Split at the middle, reverse the second half, and weave the two lists.

```java
Node middle = findMiddle(head), second = reverse(middle.next); middle.next = null;
Node first = head;
while (second != null) {
    Node a = first.next, b = second.next;
    first.next = second; second.next = a;
    first = a; second = b;
}
```

**Complexity:** O(n) time, O(1) space.
