# 391. Reverse Words in a String

**Question:** Reverse the order of words in a string, trimming extra spaces.

**Answer:** Split on whitespace, reverse the tokens, and join with single spaces.

```java
String[] w = s.trim().split("\\s+");
StringBuilder sb = new StringBuilder();
for (int i = w.length - 1; i >= 0; i--) {
    sb.append(w[i]);
    if (i > 0) sb.append(' ');
}
return sb.toString();
```

**Complexity:** O(n) time, O(n) space.
