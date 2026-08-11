# 176. Kth Permutation Sequence

**Question:** Return the kth lexicographic permutation of `1..n` without generating all permutations.

**Answer:** Factoradic indexing selects one unused digit per position.

```java
List<Integer> available = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList()); k--;
for (int remaining = n; remaining > 0; remaining--) { int block = factorial(remaining - 1), index = k / block; k %= block; answer.append(available.remove(index)); }
return answer.toString();
```

**Complexity:** O(n²) with an array list, O(n) space.
