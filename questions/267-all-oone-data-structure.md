# 267. All O(1) Data Structure

**Question:** Support increment, decrement, and retrieving any maximum or minimum key in O(1).

**Answer:** Keep count buckets in a doubly linked list and keys in each bucket's hash set.

```java
void increment(String key) { Bucket next = bucketOf(key).nextOrCreate(); move(key, next); }
void decrement(String key) { Bucket previous = bucketOf(key).previous; move(key, previous); }
```

**Complexity:** O(1) average per operation, O(n) space.
