# 395. String to Integer (atoi)

**Question:** Parse a string into a 32-bit signed integer, clamping on overflow.

**Answer:** Skip spaces, read an optional sign, accumulate digits, and clamp before overflow.

```java
int i = 0, n = s.length(), sign = 1;
long r = 0;
while (i < n && s.charAt(i) == ' ') i++;
if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) sign = s.charAt(i++) == '-' ? -1 : 1;
while (i < n && Character.isDigit(s.charAt(i))) {
    r = r * 10 + (s.charAt(i++) - '0');
    if (sign * r > Integer.MAX_VALUE) return Integer.MAX_VALUE;
    if (sign * r < Integer.MIN_VALUE) return Integer.MIN_VALUE;
}
return (int) (sign * r);
```

**Complexity:** O(n) time, O(1) space.
