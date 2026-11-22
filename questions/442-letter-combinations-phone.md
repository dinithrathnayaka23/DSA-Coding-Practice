# 442. Letter Combinations of a Phone Number

**Question:** Return all letter combinations a digit string could represent on a phone keypad.

**Answer:** Backtrack over the letters mapped to each digit.

```java
String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
void dfs(String d, int i, StringBuilder sb, List<String> res) {
    if (i == d.length()) { res.add(sb.toString()); return; }
    for (char c : map[d.charAt(i) - '0'].toCharArray()) {
        sb.append(c);
        dfs(d, i + 1, sb, res);
        sb.deleteCharAt(sb.length() - 1);
    }
}
// call only when d is not empty
```

**Complexity:** O(4ⁿ · n) time, O(n) recursion space.
