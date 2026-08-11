# 268. Design Mini Twitter

**Question:** Support posting, following, unfollowing, and retrieving the ten newest feed tweets.

**Answer:** Store each user's tweets in reverse order and k-way merge followed users' streams with a heap.

```java
PriorityQueue<Tweet> feed = new PriorityQueue<>(Comparator.comparingInt(Tweet::time).reversed()); for (int user : followees) if (!tweets[user].isEmpty()) feed.offer(tweets[user].get(0)); while (!feed.isEmpty() && answer.size() < 10) addNextTweet(feed, answer);
```

**Complexity:** O(F log F) per feed for `F` followed streams, O(F) space.
