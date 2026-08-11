# 205. Regular Expression Matching

**Question:** Match a string against a pattern containing `.` and `*`.

**Answer:** DP considers either skipping `x*` or consuming one matching character while keeping `x*` available.

```java
boolean match(int i, int j) { if (j == pattern.length()) return i == text.length(); boolean same = i < text.length() && (pattern.charAt(j) == '.' || pattern.charAt(j) == text.charAt(i)); if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') return match(i, j + 2) || same && match(i + 1, j); return same && match(i + 1, j + 1); }
```

**Complexity:** O(nm) with memoization, O(nm) space.
