# 454. Odd Even Linked List

**Question:** Group all odd-position nodes together followed by the even-position nodes, keeping order.

**Answer:** Build the odd and even chains in one pass, then link odd tail to even head.

```java
if (head == null) return null;
ListNode odd = head, even = head.next, evenHead = even;
while (even != null && even.next != null) {
    odd.next = even.next;
    odd = odd.next;
    even.next = odd.next;
    even = even.next;
}
odd.next = evenHead;
return head;
```

**Complexity:** O(n) time, O(1) space.
