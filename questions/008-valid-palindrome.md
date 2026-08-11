# 008. Valid Palindrome

**Question:** Check whether a string is a palindrome after ignoring punctuation and case.

**Answer:** Compare characters from both ends, skipping non-alphanumeric characters.

```java
int left = 0, right = text.length() - 1;
while (left < right) {
    while (left < right && !Character.isLetterOrDigit(text.charAt(left))) left++;
    while (left < right && !Character.isLetterOrDigit(text.charAt(right))) right--;
    if (Character.toLowerCase(text.charAt(left++)) != Character.toLowerCase(text.charAt(right--))) return false;
}
return true;
```

**Complexity:** O(n) time, O(1) space.
