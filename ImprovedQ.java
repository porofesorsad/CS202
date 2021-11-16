public class ImprovedQ<T> implements QueueInterface<T>
{
		private QueueNode<T> front;
		
		public ImprovedQ()
		{
			front = null;
		}
		
		public boolean isEmpty()
		{
			if(front == null)
			return true;
			return false;
		}
		
		public T dequeue()
		{
			if(isEmpty())
				return null;
			QueueNode<T> result = front;
			front = front.getLink();
			return result.getInfo();	
		}
		
		public void enqueue(T element)
		{
			QueueNode<T> newNode = new QueueNode<T>(element);
			if(isEmpty())
				front = newNode;
			else {
			QueueNode<T> current = front;
			while(current.getLink() != null)
			{
				current = current.getLink(); 
			}	
			current.setLink(newNode);
			}
		}
		
}
