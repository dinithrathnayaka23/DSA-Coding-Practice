# 348. Palindrome Number

**Question:** Check whether an integer reads the same forwards and backwards, without converting to a string.

**Answer:** Reverse the second half of the digits and compare it with the first half.

```java
if (x < 0 || (x % 10 == 0 && x != 0)) return false;
int rev = 0;
while (x > rev) {
    rev = rev * 10 + x % 10;
    x /= 10;
}
return x == rev || x == rev / 10;
```

**Complexity:** O(log n) time, O(1) space.
