# 134. Letter Combinations of a Phone Number

**Question:** Generate all letter strings represented by a digit string on a phone keypad.

**Answer:** Backtrack by choosing one mapped letter for each digit.

```java
void build(String digits, int index, StringBuilder current) { if (index == digits.length()) { answer.add(current.toString()); return; }
    for (char letter : keypad[digits.charAt(index) - '0'].toCharArray()) { current.append(letter); build(digits, index + 1, current); current.deleteCharAt(current.length() - 1); }
}
```

**Complexity:** O(4^n · n) including output construction, O(n) recursion space.
