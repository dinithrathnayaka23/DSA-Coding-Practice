# 284. Reverse Words In Place

**Question:** Reverse word order in a character array using O(1) extra space.

**Answer:** Reverse the whole array, then reverse each word and remove extra spaces.

```java
reverse(chars, 0, chars.length - 1); int start = 0; for (int end = 0; end <= chars.length; end++) if (end == chars.length || chars[end] == ' ') { reverse(chars, start, end - 1); start = end + 1; }
```

**Complexity:** O(n) time, O(1) extra space.
