# 128. Encode and Decode Strings

**Question:** Encode a list of arbitrary strings into one reversible string.

**Answer:** Prefix every string with its length and a delimiter, then read exactly that many characters.

```java
String encode(List<String> values) { StringBuilder out = new StringBuilder(); for (String value : values) out.append(value.length()).append('#').append(value); return out.toString(); }
List<String> decode(String text) { List<String> out = new ArrayList<>(); for (int i = 0; i < text.length();) { int hash = text.indexOf('#', i), length = Integer.parseInt(text.substring(i, hash)); out.add(text.substring(hash + 1, hash + 1 + length)); i = hash + 1 + length; } return out; }
```

**Complexity:** O(total characters) time and space.
