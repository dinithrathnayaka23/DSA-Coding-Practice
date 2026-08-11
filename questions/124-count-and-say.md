# 124. Count and Say

**Question:** Generate the nth term of the count-and-say sequence.

**Answer:** Read consecutive groups of the current term and describe each group.

```java
String term = "1";
for (int round = 1; round < n; round++) { StringBuilder next = new StringBuilder();
    for (int i = 0; i < term.length();) { int j = i; while (j < term.length() && term.charAt(j) == term.charAt(i)) j++; next.append(j - i).append(term.charAt(i)); i = j; }
    term = next.toString();
}
return term;
```

**Complexity:** O(total generated output) time and space.
