// dtr -- Chester Huang, Shaikat Islam, Clive Johnston

import java.util.NoSuchElementException;

public class DequeTester2 {
    
    public static void main(String[] args) {
        
        // initialize a new deque
        QQKachoo<Integer> testDeque = new QQKachoo<Integer>();
        
        // test toString capabilities with empty Deque
        System.out.println(testDeque);
        
        // test peekFirst on empty deque
        // should return null
        System.out.println(testDeque.peekFirst());
        
        // test addFirst and addLast, use various data types
        testDeque.addFirst(1);                           
        testDeque.addFirst(2);
        testDeque.addFirst(3);
        testDeque.addLast(-1);
        testDeque.addLast(-2);
        testDeque.addLast(-3);
        System.out.println(testDeque);

        // test removeFirst and removeLast
        System.out.println(testDeque.removeFirst());
        System.out.println(testDeque.removeFirst());
        System.out.println(testDeque.removeFirst());
        System.out.println(testDeque.removeLast());
        System.out.println(testDeque.removeLast());
        System.out.println(testDeque.removeLast());

        // catches NoSuchElementException when removing from empty deque
        try {
            System.out.println(testDeque.removeLast());
        }
        catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException caught");
        }
        
    }
    
}
