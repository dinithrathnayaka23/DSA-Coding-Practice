# 250. Count Primes

**Question:** Count primes smaller than `n`.

**Answer:** Use the Sieve of Eratosthenes and count unmarked values from two onward.

```java
boolean[] composite = new boolean[n]; for (int p = 2; p * p < n; p++) if (!composite[p]) for (int multiple = p * p; multiple < n; multiple += p) composite[multiple] = true; int count = 0; for (int p = 2; p < n; p++) if (!composite[p]) count++; return count;
```

**Complexity:** O(n log log n) time, O(n) space.
