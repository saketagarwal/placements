
public class LinkedListImplementation {
	Node head;

	private static class Node
	{
		int data;
		Node next;
		
		public  Node(int data)
		{
			this.data = data;
			this.next =null;
		}
	}
	
	public static void main(String[] args) {
		
		
		LinkedListImplementation l = new LinkedListImplementation();
		l.head = new Node(0);
		l.add( 1);
		l.add( 2);
		l.add( 3);
		l.add( 4);
		l.addFirst( 5);
		l.addLast(6);
		l.addAfter(7, 1);
		//l.delete(1);
		l.delete(8);
		l.delete(4);
		//System.out.println(l.head.data);
		l.print();
	}
	
	public void add(int data)
	{
		Node tmp = head;
		while(tmp.next != null)
		{
			tmp=tmp.next;
		}
		tmp.next = new Node(data);
		
	}
	
	public void addFirst( int data)
	{
		Node n = new Node(data);
		
		n.next = head;
		head =n;
	}
	
	public void addLast(int data)
	{
		Node n = new Node(data);
		Node tmp = head;
		while(tmp.next !=null)
		{
			tmp=tmp.next;
		}
		tmp.next = n;
		n.next = null;
	}
	
	public void addAfter(int data , int i)
	{
		int j= 1;
		Node tmp = head;
		Node n = new Node(data);
		while(j<i)
		{
			tmp = tmp.next;
			j++;
		}
		
		n.next = tmp.next;
		tmp.next = n;
		
	}
	
	public void delete(int i)
	{
	// delete first		
		if(i==1)
		{
			Node tmp =head.next;
			head.next=null;
			head=tmp;
			return;
		}
		
	// delete last	
		Node temp = head;
		Node prev =head;
		int j=1;
		while(temp.next != null)
		{
			prev =temp;
			temp = temp.next;
			j++;
		}
		
		if(i==j)
		{
			prev.next=null;
			return;
		}
		
	// delete middle
		int k =2;
		Node temp1 = head;
		Node temp2;
		while(k < i)
		{
			temp1 = temp1.next;
			k++;
		}
		
		temp2 = temp1.next;
		temp1.next = temp1.next.next;
		
		temp2.next = null;
		
		
	}
	
	public void print()
	{
		Node tmp =head;
		while(tmp != null)
		{
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		
	}
	
	
}
