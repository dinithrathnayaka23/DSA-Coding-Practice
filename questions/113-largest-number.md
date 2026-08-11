# 113. Largest Number

**Question:** Arrange non-negative integers to form the largest possible concatenated number.

**Answer:** Sort strings by comparing `a + b` with `b + a`.

```java
String[] values = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
Arrays.sort(values, (a, b) -> (b + a).compareTo(a + b));
return values[0].equals("0") ? "0" : String.join("", values);
```

**Complexity:** O(n log n · k) time for maximum string length `k`.
