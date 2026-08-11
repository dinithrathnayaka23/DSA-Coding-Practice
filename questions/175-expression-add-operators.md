# 175. Expression Add Operators

**Question:** Insert `+`, `-`, or `*` into digits to reach a target value.

**Answer:** Backtrack over operand lengths while carrying the evaluated value and previous multiplicative term.

```java
void build(int index, long value, long previous, String expression) { if (index == digits.length()) { if (value == target) answer.add(expression); return; } for (int end = index; end < digits.length(); end++) { if (end > index && digits.charAt(index) == '0') break; long number = Long.parseLong(digits.substring(index, end + 1)); if (index == 0) build(end + 1, number, number, "" + number); else { build(end + 1, value + number, number, expression + "+" + number); build(end + 1, value - number, -number, expression + "-" + number); build(end + 1, value - previous + previous * number, previous * number, expression + "*" + number); } } }
```

**Complexity:** Exponential in digit count, with recursion depth O(n).
