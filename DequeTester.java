//Team OnlyDuo
//Jason Lam, Brandon Zhang
//APCS2 pd5
//HW29 -- Stress is the Best
//2017-04-05

public class DequeTester {

		public static void main(String[] args){

			Deque<String> dequeTest = new QQKachoo<String>();

			System.out.println("\nnow enqueuing from front end...");
			dequeTest.addFirst("pool");
			dequeTest.addFirst("school");
			dequeTest.addFirst("tool");

			System.out.println("\nnow enqueuing from back end...");
			dequeTest.addLast("building");
			dequeTest.addLast("car");
			dequeTest.addLast("plane");

			System.out.println("\nnow testing toString()...");
			System.out.println( dequeTest );

			System.out.println("\nnow testing peek methods...");
			System.out.println( dequeTest.peekFirst() );
			System.out.println( dequeTest.peekLast() );

			System.out.println("\nnow dequeuing from front end...");
			System.out.println( dequeTest.removeFirst() );
			System.out.println( dequeTest.removeFirst() );
			System.out.println( dequeTest.removeFirst() );

			System.out.println("\nnow dequeuing from back end...");
			System.out.println( dequeTest.removeLast() );
			System.out.println( dequeTest.removeLast() );
			System.out.println( dequeTest.removeLast() );

			System.out.println("\nnow peeking from empty deque...");
			System.out.println( dequeTest.peekFirst() );

			//Will throw an exception
			System.out.println("\nnow dequeuing from empty deque...");
			System.out.println( dequeTest.removeFirst() );

		}
}
