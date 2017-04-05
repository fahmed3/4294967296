//Team 4294967296 - Fabiha Ahmed, Levi Olevsky, Shivasuryan Vummidi
//APCS2 pd5
//Lab02 -- All Hands on Deque
//2017-04-02

import java.util.ArrayList;

public class QQKachoo<T> implements Deque<T>{
    
    //The underlying data structure for our Deque is an ArrayList.
    private ArrayList<T> container;
    
    //Constructor
    public QQKachoo(){
	container = new ArrayList<T>();
    }

    /*PRECONDITION: You have a valid element and a valid Deque
    POSTCONDITION: Add the element to the start of the Deque.
    */
    public void addFirst(T x){
	container.add(0,x);
    }

    /*PRECONDITION: You have a valid element and a valid Deque
    POSTCONDITION: Add the element to the end of the Deque.
    */
    public void addLast(T x){
	container.add(x);
    }

    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Removes the first element from the Deque and returns it
    */
    public T removeFirst(){
	return container.remove(0);
    }

    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Removes the last element from the Deque and returns it
    */
    public T removeLast(){
	return container.remove(container.size() -1);
    }

    /*PRECONDITION: You have a valid Deque and is not empty
    POSTCONDITION: Return the last element of the Deque
    */
    public T peekFirst(){
	return container.get(0);
    }

    /*PRECONDITION: You have a valid Deque and is not empty
    POSTCONDITION: Return the last element of the Deque
    */
    public T peekLast(){
	return container.get(container.size()-1);
    }

    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Return true if the first  occurrence is removed, false otherwise
    */

    public boolean removeFirstOccurrence(Object o)
    {
	for(int i = 0; i < container.size(); i++){
	    if(container.get(i).equals(o)){
		container.remove(i);
		return true;
	    }
	}
	return false;
    }

    /*PRECONDITION: You have a valid Deque
    POSTCONDITION: Return true if the last occurrence is removed, false otherwise
    */
    public boolean removeLastOccurrence(Object o){
    	for(int i = container.size()-1; i > -1; i--){
	    if(container.get(i).equals(o)){
		container.remove(i);
		return true;
	    }
	}
	return false;
    }

    
    public String toString(){
	return container + "";
    }

    public static void main(String[] args){
	QQKachoo a = new QQKachoo<String>();
	a.addFirst("a");
	a.addLast("b");
	a.addLast("a");
	a.addLast("b");
	a.addLast("c");
	a.addLast("d");
	System.out.println(a);
	//System.out.println(a.peekLast());
	//System.out.println(a.removeFirstOccurrence("c"));
	//System.out.println(a);
	System.out.println(a.removeLastOccurrence("a"));
	System.out.println(a);

						 
    }
}
