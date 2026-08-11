# 252. Palindrome Number

**Question:** Decide whether an integer reads identically forward and backward.

**Answer:** Reverse only half the digits and compare the two halves.

```java
if (number < 0 || number % 10 == 0 && number != 0) return false; int reversed = 0; while (number > reversed) { reversed = reversed * 10 + number % 10; number /= 10; } return number == reversed || number == reversed / 10;
```

**Complexity:** O(log n) time, O(1) space.
