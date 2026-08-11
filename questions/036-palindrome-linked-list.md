# 036. Palindrome Linked List

**Question:** Check whether a linked list reads the same in both directions.

**Answer:** Find the middle, reverse the second half, and compare both halves.

```java
Node slow = head, fast = head;
while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
Node right = reverse(slow);
for (Node left = head; right != null; left = left.next, right = right.next)
    if (left.value != right.value) return false;
return true;
```

**Complexity:** O(n) time, O(1) extra space.
