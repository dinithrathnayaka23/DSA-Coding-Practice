# 013. Trapping Rain Water

**Question:** Compute how much water is trapped between elevation bars.

**Answer:** Two pointers maintain the best wall on each side; process the side with the smaller wall.

```java
int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, water = 0;
while (left < right) {
    if (height[left] <= height[right]) {
        leftMax = Math.max(leftMax, height[left]); water += leftMax - height[left++];
    } else {
        rightMax = Math.max(rightMax, height[right]); water += rightMax - height[right--];
    }
}
return water;
```

**Complexity:** O(n) time, O(1) space.
