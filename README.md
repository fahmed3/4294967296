# 4294967296

# Why did we choose an ArrayList?
- Easier to implement than linked lists
- More intuitive
- More robust
- Not the most efficient, but it helps us get a grasp of how Deque works
- Because it allows for cleaner, more understandable, and nicer code
- It is C00L

# Method implementations for Deque for type T:
<br>
**T IS A GENERIC TYPE**
<br>
- addFirst(T); **returns void and adds the element to the start of the list.**
- removeFirst(); **returns a type T element and removes the element from the start of the list.**
- peekFirst(); **returns a type T element from the start of the list.**
- addLast(T); **returns void and adds the element to the end of the list.**
- removeLast(); **returns a type T element and removes the element from the end of the list.**
- peekLast(); **returns a type T element from the end of the list.**
<br>
RATIONALE FOR CHOOSING THESE METHODS: These methods expand on what Queue does and allows for adding and removing from both the front and the end of the list.
