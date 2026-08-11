# 123. Longest Palindromic Substring

**Question:** Return the longest palindromic substring.

**Answer:** Expand around every character and every gap, retaining the widest expansion.

```java
for (int center = 0; center < text.length(); center++) { update(expand(text, center, center)); update(expand(text, center, center + 1)); }
String expand(String s, int left, int right) { while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) { left--; right++; } return s.substring(left + 1, right); }
```

**Complexity:** O(n²) time, O(1) auxiliary space.
