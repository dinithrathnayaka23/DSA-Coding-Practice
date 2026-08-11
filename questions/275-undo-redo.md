# 275. Undo and Redo

**Question:** Design undo and redo operations for a text editor.

**Answer:** Push completed states onto an undo stack; undo moves one state to redo and vice versa.

```java
void edit(String state) { undo.push(current); current = state; redo.clear(); }
void undo() { if (!undo.isEmpty()) { redo.push(current); current = undo.pop(); } }
```

**Complexity:** O(1) stack operations, O(number of states) space.
