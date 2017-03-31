//4294967296 - Fabiha Ahmed, 

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

    public String toString(){
	return container + "";
    }

    public static void main(String[] args){
	QQKachoo a = new QQKachoo<String>();
	a.addFirst("a");
	a.addLast("b");
	System.out.println(a);
	System.out.println(a.peekLast());



    }
}
