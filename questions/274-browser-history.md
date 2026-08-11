# 274. Browser History

**Question:** Support visit, back, and forward navigation.

**Answer:** Two stacks represent pages behind and ahead of the current page.

```java
void visit(String url) { back.push(current); current = url; forward.clear(); }
String goBack() { if (!back.isEmpty()) { forward.push(current); current = back.pop(); } return current; }
```

**Complexity:** O(1) average navigation, O(n) history space.
