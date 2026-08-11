# 204. Decode Ways

**Question:** Count ways to decode digits where `1..26` represent letters.

**Answer:** A digit contributes the previous count; a valid two-digit number contributes the count two positions back.

```java
int previousTwo = 1, previousOne = text.charAt(0) == '0' ? 0 : 1;
for (int i = 1; i < text.length(); i++) { int current = text.charAt(i) == '0' ? 0 : previousOne; int pair = Integer.parseInt(text.substring(i - 1, i + 1)); if (pair >= 10 && pair <= 26) current += previousTwo; previousTwo = previousOne; previousOne = current; }
return previousOne;
```

**Complexity:** O(n) time, O(1) space.
