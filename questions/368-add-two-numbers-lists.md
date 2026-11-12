# 368. Add Two Numbers

**Question:** Add two numbers stored as reversed-digit linked lists.

**Answer:** Add digit by digit with a carry, building the result list.

```java
ListNode dummy = new ListNode(0), cur = dummy;
int carry = 0;
while (a != null || b != null || carry > 0) {
    int sum = carry + (a != null ? a.val : 0) + (b != null ? b.val : 0);
    cur.next = new ListNode(sum % 10);
    cur = cur.next;
    carry = sum / 10;
    if (a != null) a = a.next;
    if (b != null) b = b.next;
}
return dummy.next;
```

**Complexity:** O(max(n, m)) time and space.
