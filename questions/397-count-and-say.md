# 397. Count and Say

**Question:** Return the nth term of the count-and-say sequence.

**Answer:** Build each term by run-length describing the previous term.

```java
String s = "1";
for (int i = 1; i < n; i++) {
    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < s.length(); ) {
        int k = j;
        while (k < s.length() && s.charAt(k) == s.charAt(j)) k++;
        sb.append(k - j).append(s.charAt(j));
        j = k;
    }
    s = sb.toString();
}
return s;
```

**Complexity:** O(length of the nth term) time and space.
