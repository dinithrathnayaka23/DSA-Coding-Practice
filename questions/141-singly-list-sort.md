# 141. Sort a Linked List

**Question:** Sort a singly linked list in O(n log n) time.

**Answer:** Split with slow/fast pointers, recursively sort both halves, and merge them.

```java
if (head == null || head.next == null) return head;
Node middle = splitAtMiddle(head); Node left = sortList(head), right = sortList(middle); return merge(left, right);
```

**Complexity:** O(n log n) time, O(log n) recursion space.
