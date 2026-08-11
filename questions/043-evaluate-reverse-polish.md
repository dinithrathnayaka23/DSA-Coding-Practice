# 043. Evaluate Reverse Polish Notation

**Question:** Evaluate an arithmetic expression written in postfix notation.

**Answer:** Push operands; on an operator, pop the right operand first, then the left operand.

```java
Deque<Integer> stack = new ArrayDeque<>();
for (String token : tokens) {
    if ("+-*/".contains(token) && token.length() == 1) {
        int right = stack.pop(), left = stack.pop();
        stack.push(token.equals("+") ? left + right : token.equals("-") ? left - right : token.equals("*") ? left * right : left / right);
    } else stack.push(Integer.parseInt(token));
}
return stack.pop();
```

**Complexity:** O(n) time, O(n) space.
