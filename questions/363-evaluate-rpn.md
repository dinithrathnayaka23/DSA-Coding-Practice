# 363. Evaluate Reverse Polish Notation

**Question:** Evaluate an arithmetic expression given in reverse Polish notation.

**Answer:** Push numbers; on an operator pop two operands and push the result.

```java
Deque<Integer> st = new ArrayDeque<>();
for (String tk : tokens) {
    switch (tk) {
        case "+": st.push(st.pop() + st.pop()); break;
        case "*": st.push(st.pop() * st.pop()); break;
        case "-": { int b = st.pop(), a = st.pop(); st.push(a - b); break; }
        case "/": { int b = st.pop(), a = st.pop(); st.push(a / b); break; }
        default: st.push(Integer.parseInt(tk));
    }
}
return st.pop();
```

**Complexity:** O(n) time, O(n) space.
