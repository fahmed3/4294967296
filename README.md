# Team 4294967296 - Fabiha Ahmed, Levi Olevsky, Shivasuryan Vummidi

# Why did we choose an ArrayList?
- Easier to implement than linked lists
- More intuitive
- More robust
- Not the most efficient, but it helps us get a grasp of how Deque works
- Because it allows for cleaner, more understandable, and nicer code
- It is C00L

# Method implementations for Deque for type T:
- `addFirst(T);` **returns void and adds the element to the start of the list.**
- `removeFirst();` **returns a type T element and removes the element from the start of the list.**
- `peekFirst();` **returns a type T element from the start of the list.**
- `addLast(T);` **returns void and adds the element to the end of the list.**
- `removeLast();` **returns a type T element and removes the element from the end of the list.**
- `peekLast();` **returns a type T element from the end of the list.**
- `removeFirstOccurrence(Object o);` **returns true if the first occurrence of *o* is removed, false otherwise**
- `removeLastOccurrence(Object o);` **returns true if the last occurrence of *o* is removed, false otherwise**

# Rationale for Method Selection:
These methods expand on what Queue does and allows for adding and removing from both the front and the end of the list. It also lets us have better flexibility with our code. We chose the methods that throw exceptions over the ones returning null (addFirst(T) vs offerFirst(T)) because the exceptions give information on what went wrong and how to fix it. Methods that return null are not particularly good at offering an explanation of why an error occurred; despite the robustness of our code, a person can still try to remove an element from an empty Deque or can try to display the front or end of an empty Deque, and not knowing that the Deque is empty and only seeing a null can lead to more problems. In short, the error messages allow for direct feedback to the person using this Deque. 
