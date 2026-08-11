# 121. String to Integer

**Question:** Parse a signed decimal string while ignoring leading spaces and clamping overflow.

**Answer:** Read the sign and digits while checking overflow before multiplying by ten.

```java
int i = 0, sign = 1, value = 0; while (i < text.length() && text.charAt(i) == ' ') i++;
if (i < text.length() && (text.charAt(i) == '+' || text.charAt(i) == '-')) sign = text.charAt(i++) == '-' ? -1 : 1;
while (i < text.length() && Character.isDigit(text.charAt(i))) { int digit = text.charAt(i++) - '0';
    if (value > (Integer.MAX_VALUE - digit) / 10) return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; value = value * 10 + digit;
}
return sign * value;
```

**Complexity:** O(n) time, O(1) space.
