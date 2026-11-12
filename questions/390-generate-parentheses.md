# 390. Generate Parentheses

**Question:** Generate all valid combinations of n pairs of parentheses.

**Answer:** Add '(' while opens remain and ')' while closes do not exceed opens.

```java
void gen(int open, int close, int n, StringBuilder sb, List<String> res) {
    if (sb.length() == 2 * n) { res.add(sb.toString()); return; }
    if (open < n) { sb.append('('); gen(open + 1, close, n, sb, res); sb.deleteCharAt(sb.length() - 1); }
    if (close < open) { sb.append(')'); gen(open, close + 1, n, sb, res); sb.deleteCharAt(sb.length() - 1); }
}
```

**Complexity:** O(4ⁿ / √n) time, O(n) recursion space.
