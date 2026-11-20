# 430. Decode String

**Question:** Decode strings of the form k[encoded] where encoded is repeated k times.

**Answer:** Two stacks for counts and partial strings; on ']' repeat the current string.

```java
Deque<Integer> counts = new ArrayDeque<>();
Deque<StringBuilder> strs = new ArrayDeque<>();
StringBuilder cur = new StringBuilder();
int k = 0;
for (char c : s.toCharArray()) {
    if (Character.isDigit(c)) k = k * 10 + (c - '0');
    else if (c == '[') { counts.push(k); strs.push(cur); cur = new StringBuilder(); k = 0; }
    else if (c == ']') {
        StringBuilder prev = strs.pop();
        for (int i = counts.pop(); i > 0; i--) prev.append(cur);
        cur = prev;
    } else cur.append(c);
}
return cur.toString();
```

**Complexity:** O(output length) time and space.
