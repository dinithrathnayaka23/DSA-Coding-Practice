# 453. Rotate List

**Question:** Rotate a linked list to the right by k places.

**Answer:** Close the list into a ring, then cut it at the new tail, n - k % n steps from the head.

```java
if (head == null || head.next == null) return head;
int n = 1;
ListNode tail = head;
while (tail.next != null) { tail = tail.next; n++; }
tail.next = head;
for (int i = n - k % n; i > 0; i--) tail = tail.next;
head = tail.next;
tail.next = null;
return head;
```

**Complexity:** O(n) time, O(1) space.
