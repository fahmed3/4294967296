public interface Deque<Card>{

    public void addFirst(Card x);

    public void addLast(Card x);

    public Card removeFirst();

    public Card removeLast();

    public Card peekFirst();

    public Card peekLast();


}
