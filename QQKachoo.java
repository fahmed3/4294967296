//Team 4294967296 - Fabiha Ahmed, Levi Olevsky, Shivasuryan Vummidi
//APCS2 pd5
//Lab02 -- All Hands on Deque
//2017-04-02

import java.util.ArrayList;

public class QQKachoo<T> implements Deque<T>{

    private ArrayList<T> container;

    public QQKachoo(){
	container = new ArrayList<T>();
    }

    public void addFirst(T x){
	container.add(0,x);
    }

    public void addLast(T x){
	container.add(x);
    }

    public T removeFirst(){
	return container.remove(0);
    }

    public T removeLast(){
	return container.remove(container.size() -1);
    }

    public T peekFirst(){
	return container.get(0);
    }

    public T peekLast(){
	return container.get(container.size()-1);
    }

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
