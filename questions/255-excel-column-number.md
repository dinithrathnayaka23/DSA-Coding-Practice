# 255. Excel Column Number

**Question:** Convert a spreadsheet column label such as `AB` into its number.

**Answer:** Treat letters as base-26 digits with values 1 through 26.

```java
int answer = 0; for (char c : title.toCharArray()) answer = answer * 26 + c - 'A' + 1; return answer;
```

**Complexity:** O(n) time, O(1) space.
