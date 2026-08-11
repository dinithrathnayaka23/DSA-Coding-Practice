# 039. Add Two Numbers

**Question:** Add two non-negative integers represented by reverse-order linked lists.

**Answer:** Walk both lists while carrying the digit overflow into the next position.

```java
Node dummy = new Node(0), tail = dummy; int carry = 0;
while (a != null || b != null || carry != 0) {
    int sum = carry + (a == null ? 0 : a.value) + (b == null ? 0 : b.value);
    tail.next = new Node(sum % 10); tail = tail.next; carry = sum / 10;
    if (a != null) a = a.next; if (b != null) b = b.next;
}
return dummy.next;
```

**Complexity:** O(max(n, m)) time, O(max(n, m)) result space.
