# 197. Accounts Merge

**Question:** Merge accounts sharing at least one email address.

**Answer:** Union emails belonging to the same account, then group emails by their representative.

```java
for (List<String> account : accounts) for (int i = 2; i < account.size(); i++) union(account.get(1), account.get(i));
for (String email : allEmails) groups.computeIfAbsent(find(email), x -> new TreeSet<>()).add(email);
```

**Complexity:** O(N log N) time due to sorting grouped emails, O(N) space.
