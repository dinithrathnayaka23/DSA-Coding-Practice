# 206. Wildcard Matching

**Question:** Match a string against a pattern containing `?` and `*`.

**Answer:** A star either consumes the next text character or matches zero characters.

```java
boolean match(int i, int j) { if (j == pattern.length()) return i == text.length(); if (pattern.charAt(j) == '*') return match(i, j + 1) || i < text.length() && match(i + 1, j); return i < text.length() && (pattern.charAt(j) == '?' || pattern.charAt(j) == text.charAt(i)) && match(i + 1, j + 1); }
```

**Complexity:** O(nm) with memoization, O(nm) space.
