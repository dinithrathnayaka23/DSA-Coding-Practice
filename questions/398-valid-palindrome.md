# 398. Valid Palindrome

**Question:** Check whether a string is a palindrome ignoring case and non-alphanumeric characters.

**Answer:** Two pointers skipping characters that are not letters or digits.

```java
int l = 0, r = s.length() - 1;
while (l < r) {
    while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
    while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
    if (Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) return false;
}
return true;
```

**Complexity:** O(n) time, O(1) space.
