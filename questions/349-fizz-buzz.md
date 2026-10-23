# 349. Fizz Buzz

**Question:** Print numbers 1 to n, replacing multiples of 3 with Fizz, of 5 with Buzz, and of both with FizzBuzz.

**Answer:** Check divisibility by 15 first, then 3 and 5.

```java
List<String> out = new ArrayList<>();
for (int i = 1; i <= n; i++) {
    if (i % 15 == 0) out.add("FizzBuzz");
    else if (i % 3 == 0) out.add("Fizz");
    else if (i % 5 == 0) out.add("Buzz");
    else out.add(String.valueOf(i));
}
return out;
```

**Complexity:** O(n) time, O(n) space.
