# 135. Generate Parentheses

**Question:** Generate all balanced strings containing `n` pairs of parentheses.

**Answer:** Add an opening parenthesis while available and a closing parenthesis only when it cannot exceed openings.

```java
void build(StringBuilder current, int open, int close) { if (current.length() == 2 * n) { answer.add(current.toString()); return; }
    if (open < n) { current.append('('); build(current, open + 1, close); current.deleteCharAt(current.length() - 1); }
    if (close < open) { current.append(')'); build(current, open, close + 1); current.deleteCharAt(current.length() - 1); }
}
```

**Complexity:** O(Cn · n) output time, O(n) recursion space.
