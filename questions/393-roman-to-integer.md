# 393. Roman to Integer

**Question:** Convert a Roman numeral to an integer.

**Answer:** Subtract a symbol when a larger one follows it, otherwise add it.

```java
Map<Character, Integer> v = Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
int sum = 0;
for (int i = 0; i < s.length(); i++) {
    int cur = v.get(s.charAt(i));
    if (i + 1 < s.length() && cur < v.get(s.charAt(i + 1))) sum -= cur;
    else sum += cur;
}
return sum;
```

**Complexity:** O(n) time, O(1) space.
