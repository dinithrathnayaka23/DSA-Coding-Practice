# 077. Palindromic Substrings

**Question:** Count every substring that is a palindrome.

**Answer:** Expand around every character and every gap between characters.

```java
int count = 0;
for (int center = 0; center < text.length(); center++) {
    count += expand(text, center, center);
    count += expand(text, center, center + 1);
}
int expand(String s, int left, int right) {
    int count = 0;
    while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) count++;
    return count;
}
```

**Complexity:** O(n²) time, O(1) extra space.
