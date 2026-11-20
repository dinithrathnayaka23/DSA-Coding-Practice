# 431. Simplify Path

**Question:** Convert a Unix absolute path to its canonical form.

**Answer:** Split on '/', push names, pop on '..', and ignore '.' and empty parts.

```java
Deque<String> st = new ArrayDeque<>();
for (String p : path.split("/")) {
    if (p.equals("..")) { if (!st.isEmpty()) st.pop(); }
    else if (!p.isEmpty() && !p.equals(".")) st.push(p);
}
if (st.isEmpty()) return "/";
StringBuilder sb = new StringBuilder();
while (!st.isEmpty()) sb.append('/').append(st.removeLast());
return sb.toString();
```

**Complexity:** O(n) time, O(n) space.
