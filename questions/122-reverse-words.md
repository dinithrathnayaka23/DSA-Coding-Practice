# 122. Reverse Words in a String

**Question:** Reverse word order while removing extra spaces.

**Answer:** Split on whitespace, reverse the tokens, and join with one space.

```java
String[] words = text.trim().split("\\s+");
Collections.reverse(Arrays.asList(words));
return String.join(" ", words);
```

**Complexity:** O(n) time, O(n) space.
