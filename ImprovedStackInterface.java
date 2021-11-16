public interface ImprovedStackInterface<T>
{
	
  public void push(T item) throws StackFullException; //throws StackFullException
  public void push(T item, T item2) throws StackFullException;

  public void pop() throws StackEmptyException;
  
  public void doublePop() throws StackEmptyException;

  public T top() throws StackEmptyException;  
}  


