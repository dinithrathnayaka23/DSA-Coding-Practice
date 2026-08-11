# 041. Valid Parentheses

**Question:** Check whether brackets are correctly opened and closed.

**Answer:** Push opening brackets and require the matching opening bracket for every closing bracket.

```java
Deque<Character> stack = new ArrayDeque<>();
for (char c : text.toCharArray()) {
    if (c == '(' || c == '[' || c == '{') stack.push(c);
    else {
        char expected = c == ')' ? '(' : c == ']' ? '[' : '{';
        if (stack.isEmpty() || stack.pop() != expected) return false;
    }
}
return stack.isEmpty();
```

**Complexity:** O(n) time, O(n) space.
