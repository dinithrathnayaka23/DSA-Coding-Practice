# 222. Assign Cookies

**Question:** Maximize satisfied children when each child needs a minimum cookie size.

**Answer:** Sort both lists and greedily give the smallest adequate cookie to the least demanding child.

```java
Arrays.sort(children); Arrays.sort(cookies); int child = 0; for (int cookie : cookies) if (child < children.length && cookie >= children[child]) child++; return child;
```

**Complexity:** O(n log n + m log m) time, O(1) extra space.
