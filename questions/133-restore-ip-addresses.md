# 133. Restore IP Addresses

**Question:** Insert three dots into a digit string to form all valid IPv4 addresses.

**Answer:** Backtrack over one-, two-, and three-digit segments, rejecting leading zeroes and values above 255.

```java
void search(String text, int index, List<String> parts) { if (parts.size() == 4) { if (index == text.length()) answer.add(String.join(".", parts)); return; }
    for (int end = index + 1; end <= Math.min(text.length(), index + 3); end++) { String part = text.substring(index, end); if (valid(part)) { parts.add(part); search(text, end, parts); parts.remove(parts.size() - 1); } }
}
```

**Complexity:** O(1) bounded output search, O(1) recursion depth.
