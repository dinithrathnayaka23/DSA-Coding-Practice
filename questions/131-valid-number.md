# 131. Valid Number

**Question:** Determine whether a string represents a valid decimal or scientific-notation number.

**Answer:** Use a small state machine tracking digits, decimal point, exponent, and optional signs.

```java
boolean digit = false, exponent = false, exponentDigit = true;
for (int i = 0; i < text.length(); i++) { char c = text.charAt(i);
    if (Character.isDigit(c)) { digit = true; if (exponent) exponentDigit = true; }
    else if (c == 'e' || c == 'E') { if (!digit || exponent) return false; exponent = true; exponentDigit = false; }
    else if (c == '+' || c == '-') { if (i > 0 && text.charAt(i - 1) != 'e' && text.charAt(i - 1) != 'E') return false; }
    else if (c == '.') { if (exponent) return false; } else return false;
}
return digit && exponentDigit;
```

**Complexity:** O(n) time, O(1) space.
