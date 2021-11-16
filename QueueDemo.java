
public class QueueDemo {

	public static void main(String[] args) 
	{	
		QueueInterface<String> myQueue = new ImprovedQ<String>();
		myQueue.enqueue("A");
		myQueue.enqueue("B");
		myQueue.enqueue("C");
		myQueue.enqueue("D");
		String discard = myQueue.dequeue();
		discard = myQueue.dequeue();
		
		while(!(myQueue.isEmpty()))
		{
			String front = myQueue.dequeue();
			System.out.println(front);
		}
		
	}

}
