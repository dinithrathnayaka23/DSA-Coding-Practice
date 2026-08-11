# 132. Zigzag Conversion

**Question:** Write a string in a zigzag across a given number of rows and read rows sequentially.

**Answer:** Track the current row and direction while appending characters to row builders.

```java
List<StringBuilder> rows = new ArrayList<>(); for (int i = 0; i < rowCount; i++) rows.add(new StringBuilder());
int row = 0, direction = 1; for (char c : text.toCharArray()) { rows.get(row).append(c); if (row == 0) direction = 1; if (row == rowCount - 1) direction = -1; row += direction; }
return rows.stream().map(StringBuilder::toString).collect(Collectors.joining());
```

**Complexity:** O(n) time, O(n) space.
