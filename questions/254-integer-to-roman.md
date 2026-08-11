# 254. Integer to Roman

**Question:** Convert an integer from 1 to 3999 into Roman notation.

**Answer:** Greedily subtract the largest representable Roman value.

```java
int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; for (int i = 0; i < values.length; i++) while (number >= values[i]) { answer.append(symbols[i]); number -= values[i]; } return answer.toString();
```

**Complexity:** O(1) bounded by numeral length.
