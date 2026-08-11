# 248. Repeated DNA Sequences

**Question:** Find every length-10 DNA sequence occurring more than once.

**Answer:** Encode each nucleotide in two bits and count 20-bit rolling codes.

```java
Map<Integer, Integer> counts = new HashMap<>(); for (int i = 0; i + 10 <= dna.length(); i++) { int code = encode(dna, i, 10); if (counts.merge(code, 1, Integer::sum) == 2) answer.add(dna.substring(i, i + 10)); }
```

**Complexity:** O(n) time, O(n) space.
