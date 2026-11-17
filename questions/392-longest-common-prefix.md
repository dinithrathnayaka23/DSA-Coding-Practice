# 392. Longest Common Prefix

**Question:** Find the longest common prefix among an array of strings.

**Answer:** Shrink the prefix until every string starts with it.

```java
String p = strs[0];
for (String s : strs)
    while (!s.startsWith(p)) p = p.substring(0, p.length() - 1);
return p;
```

**Complexity:** O(total characters) time, O(1) space.
