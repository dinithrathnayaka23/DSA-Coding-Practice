# 130. Word Pattern

**Question:** Check whether words follow a one-to-one character pattern.

**Answer:** Map pattern characters to words and words back to characters.

```java
String[] words = text.split(" "); if (words.length != pattern.length()) return false;
Map<Character, String> letters = new HashMap<>(); Map<String, Character> reverse = new HashMap<>();
for (int i = 0; i < words.length; i++) { if (!words[i].equals(letters.getOrDefault(pattern.charAt(i), words[i]))) return false; if (reverse.getOrDefault(words[i], pattern.charAt(i)) != pattern.charAt(i)) return false; letters.put(pattern.charAt(i), words[i]); reverse.put(words[i], pattern.charAt(i)); }
return true;
```

**Complexity:** O(n) average time, O(n) space.
