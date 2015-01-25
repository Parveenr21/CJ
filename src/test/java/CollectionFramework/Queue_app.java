package CollectionFramework;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue_app {

	public static void main(String ...dd)
	{

		Queue<String> qu = new ArrayBlockingQueue<String>(4);	//here 4 is size only 4 elements can be there in the queue.

		qu.add("chamoli");
		qu.add("Uttarkashi");
		qu.add("Rishikesh");
		qu.add("Pauri");

		//qu.add("temp")  //illegal state exception as size is 4



		/*
		 * FETCH
		 * 	
		 */
		for(String str : qu)
		{

			System.out.println(str);


		}







		/*
		 * REMOVAL..This is most IMPORTANT!!!!!!!!!!1 here..use it when FIFO is to be done..automatically the first element 
		 * will be deleted from here.
		 */
		for(int i=0;i<4;i++)
		{
			System.out.println(qu.element());		//qu.element returns the first or head of Queue.
			qu.remove();  
		}



		//qu.remove(); No such eleement exception as queue is empty now


		/*
		 * Queue DIFFERENT APIS which do not throw exception and perform same operation
		 * 
		 * qu.add(e)    qu.offer(e) //It will add element till capacity and then no exception
		 * qu.remove()	qu.poll() //It will remove elemetn till capacity and then no exception (poll is remove)
		 * qu.element()  qu.peek() //I will retrun string till element after that NULL   (peek means checking.)
		 */

		System.out.println("+-+-+-+-+-+-+-+-+-+-NEW APIS");

		qu.offer("ddd");
		qu.poll();
		qu.poll();
		System.out.println(qu.peek());

	}

}
