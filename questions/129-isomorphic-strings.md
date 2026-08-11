# 129. Isomorphic Strings

**Question:** Decide whether characters in one string can be consistently mapped to the other.

**Answer:** Maintain mappings in both directions so two source characters cannot map to one target character.

```java
Map<Character, Character> forward = new HashMap<>(), backward = new HashMap<>();
for (int i = 0; i < a.length(); i++) { char x = a.charAt(i), y = b.charAt(i);
    if (forward.getOrDefault(x, y) != y || backward.getOrDefault(y, x) != x) return false; forward.put(x, y); backward.put(y, x); }
return true;
```

**Complexity:** O(n) time, O(alphabet) space.
