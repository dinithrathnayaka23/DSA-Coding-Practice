# 125. Implement Substring Search

**Question:** Return the first index where a pattern occurs in a text.

**Answer:** The straightforward scan checks each possible start; KMP can improve worst-case behavior.

```java
for (int start = 0; start + pattern.length() <= text.length(); start++) {
    int j = 0; while (j < pattern.length() && text.charAt(start + j) == pattern.charAt(j)) j++;
    if (j == pattern.length()) return start;
}
return -1;
```

**Complexity:** O(nm) time for the direct method, O(1) space.
