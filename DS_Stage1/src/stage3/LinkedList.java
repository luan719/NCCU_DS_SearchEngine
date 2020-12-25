public class LinkedList<T>
{
	
	private class Node
	{
		public T t;
		public Node next;
		public Node(T t, Node next) 
		{
			this.t = t;
			this.next = next;
		}
	}
	
	private int index = 0;
	private int size = 0;
	private Node current;
	private Node head;
	
	
	public boolean isEmpty() 
	{
		// 1. check if the list is empty
		
		head = current;
		
		while(current != null) 
		{
			current = current.next;
		}
		
		
		return head == null;
	}
	
	public int size() 
	{
		// 2. return size of the list
		
		head = current;
		
		while(current != null) 
		{
			current = current.next;
			
			size++;
		}
		return size;
	}
	
	public void resetIndex() 
	{
		index = 0;
		current = head;
	}
	
	public void add(T t)
	{
		if(size==0) 
		{
			head = new Node(t, null);
		}
		else 
		{
			current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = new Node(t, null);
		}
		size++;
		resetIndex();
	}
	
	public void add(int index, T t)
	{
		// 3. add new node by using given index
			
			current = head;
			
			int now = 0;
			
			while(current.next != null && now<index-1)
			{
				current = current.next;
				now++;
				
				if(now == index-1)
				{
					new Node(t, null).next = current.next;
					current.next = new Node(t, null);
					
				}
				
			}		
		size++;	
		resetIndex();
	}
	
	public T get(int index) 
	{
		// 4. return the node at given index
		
		head = current;
		
		for(int i = 0 ; i <= index ; i++)
		{
			current = current.next;
		}
		
		return (T) current;
//		return null;
	}
	
	public T remove(int index) 
	{
		// 5. remove the node at given index and return the node
		
		head = current;
		
		for(int i = 0 ; i < index ; i++)
		{
			current = current.next;
		}
			
		 Node deleteWord = current.next;
		
		    current = current.next.next;

		
		resetIndex();
		return (T) deleteWord;
	}
	
	public void printList()
{
		//6. print the list 
		
		head = current;
		 
		
		while(current != null) 
		{
			System.out.println(current);
			
			current = current.next;
			
		}
	
	}
	

}
