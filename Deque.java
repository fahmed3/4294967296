public interface Deque<Card>{
    /*PRECONDITION: You have a valid element and a valid Deque
    POSTCONDITION: Add the element to the start of the Deque.
    */
    public void addFirst(Card x);
    /*PRECONDITION: You have a valid element and a valid Deque
    POSTCONDITION: Add the element to the end of the Deque.
    */
    public void addLast(Card x);
    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Removes the first element from the Deque
    */
    public Card removeFirst();
    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Removes the last element from the Deque
    */
    public Card removeLast();
    /*PRECONDITION: You have a valid Deque and is not empty
    POSTCONDITION: Return the first element of the Deque
    */
    public Card peekFirst();
    /*PRECONDITION: You have a valid Deque and is not empty
    POSTCONDITION: Return the last element of the Deque
    */
    public Card peekLast();
    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Return true if the first occurrence is removed, false otherwise
    */
    public boolean removeFirstOccurrence(Object o);
    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Return true if the last occurrence is removed, false otherwise
    */
    public boolean removeLastOccurrence(Object o);
}
