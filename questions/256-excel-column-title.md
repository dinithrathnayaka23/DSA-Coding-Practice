# 256. Excel Column Title

**Question:** Convert a positive column number into its spreadsheet label.

**Answer:** Subtract one before taking a base-26 remainder because the alphabet is one-indexed.

```java
StringBuilder answer = new StringBuilder(); while (number > 0) { number--; answer.append((char) ('A' + number % 26)); number /= 26; } return answer.reverse().toString();
```

**Complexity:** O(log₂₆ n) time, O(log n) space.
