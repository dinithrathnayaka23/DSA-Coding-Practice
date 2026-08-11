# 127. Rabin–Karp Search

**Question:** Search for a pattern using rolling hashes.

**Answer:** Compare a pattern hash with each window hash and verify characters when hashes match.

```java
long window = 0, patternHash = 0, power = 1;
for (int i = 0; i < pattern.length(); i++) { patternHash = patternHash * base + pattern.charAt(i); window = window * base + text.charAt(i); power *= base; }
for (int start = 0; start + pattern.length() <= text.length(); start++) { if (window == patternHash && matches(text, pattern, start)) return start;
    if (start + pattern.length() < text.length()) window = window * base + text.charAt(start + pattern.length()) - power * text.charAt(start); }
return -1;
```

**Complexity:** O(n + m) expected time, O(1) space.
