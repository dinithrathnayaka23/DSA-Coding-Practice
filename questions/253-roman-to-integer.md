# 253. Roman to Integer

**Question:** Convert a Roman numeral to an integer.

**Answer:** Subtract a symbol when it is smaller than the symbol immediately after it; otherwise add it.

```java
int answer = 0; for (int i = 0; i < text.length(); i++) answer += value(text.charAt(i)) < (i + 1 < text.length() ? value(text.charAt(i + 1)) : 0) ? -value(text.charAt(i)) : value(text.charAt(i)); return answer;
```

**Complexity:** O(n) time, O(1) space.
