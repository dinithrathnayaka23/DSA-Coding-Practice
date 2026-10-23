# 301. Valid Parentheses

**Question:** Check whether a string of brackets ()[]{} is balanced.

**Answer:** Push the expected closing bracket for each opener; each closer must match the top.

```java
Deque<Character> st = new ArrayDeque<>();
for (char c : s.toCharArray()) {
    if (c == '(') st.push(')');
    else if (c == '[') st.push(']');
    else if (c == '{') st.push('}');
    else if (st.isEmpty() || st.pop() != c) return false;
}
return st.isEmpty();
```

**Complexity:** O(n) time, O(n) space.
