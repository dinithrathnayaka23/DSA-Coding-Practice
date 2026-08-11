# 034. Remove Nth Node From End

**Question:** Remove the nth node from the end of a linked list.

**Answer:** Use a dummy node and keep fast exactly `n` steps ahead of slow.

```java
Node dummy = new Node(0); dummy.next = head;
Node slow = dummy, fast = dummy;
for (int i = 0; i < n; i++) fast = fast.next;
while (fast.next != null) { slow = slow.next; fast = fast.next; }
slow.next = slow.next.next;
return dummy.next;
```

**Complexity:** O(n) time, O(1) space.
