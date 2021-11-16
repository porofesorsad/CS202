public class QueueNode <T>
{
private T info;
private QueueNode<T> link;

	public QueueNode(T info)
	{
	this.info = info;
	link = null;
	}
	
	public void setInfo(T info) 
	{
	this.info = info;	
	}
	
	public T getInfo()
	{
		return info;
	}
	
	public void setLink(QueueNode<T> link)
	{
		this.link = link;
	}
	
	public QueueNode<T> getLink()
	{
		return link;
	}	
}
