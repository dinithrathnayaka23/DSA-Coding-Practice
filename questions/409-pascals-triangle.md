# 409. Pascal's Triangle

**Question:** Generate the first numRows rows of Pascal's triangle.

**Answer:** Each inner value is the sum of the two values above it.

```java
List<List<Integer>> tri = new ArrayList<>();
for (int i = 0; i < numRows; i++) {
    List<Integer> row = new ArrayList<>();
    for (int j = 0; j <= i; j++)
        row.add(j == 0 || j == i ? 1 : tri.get(i - 1).get(j - 1) + tri.get(i - 1).get(j));
    tri.add(row);
}
return tri;
```

**Complexity:** O(n²) time and space.
