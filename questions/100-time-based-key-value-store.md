# 100. Time-Based Key-Value Store

**Question:** Store values by key and timestamp, then return the value at or before a requested timestamp.

**Answer:** Keep timestamps sorted for each key and binary-search the rightmost timestamp not exceeding the request.

```java
void set(String key, String value, int time) { history.computeIfAbsent(key, k -> new ArrayList<>()).add(new Entry(time, value)); }
String get(String key, int time) {
    List<Entry> entries = history.getOrDefault(key, List.of()); int left = 0, right = entries.size() - 1; String answer = null;
    while (left <= right) { int mid = (left + right) >>> 1; if (entries.get(mid).time() <= time) { answer = entries.get(mid).value(); left = mid + 1; } else right = mid - 1; }
    return answer;
}
```

**Complexity:** O(1) set when timestamps arrive in order and O(log n) get, O(n) space.
