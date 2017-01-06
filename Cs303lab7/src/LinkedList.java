public class LinkedList {
	
	    private Node first;
	    
	    public LinkedList()
	    {
	    	first = null;
	    }
	    public boolean isEmpty()
	    {
	        return (first==null);
	    }
	   	   
	    public void insert(int i) {
			Node newNode = new Node(i);
	        newNode.next = first;
	        first = newNode;
		
	    }
	public void display() {
		 System.out.println("List items :");
	        Node current = first;
	        while(current != null)
	        {
	            current.displayNode();
	            current = current.next; 
	        }
	        System.out.println("");
	}
	public Node delete(int i) {
		//int i = 0;
		 Node current = first;
	        Node previous = first;
	        while(current.item != i)
	        {
	            if(current.next == null)
	                return null;
	            else
	            {
	                previous = current;
	                current = current.next;
	            }
	        }
	        if(current == first)
	            first = first.next;
	        else
	            previous.next = current.next;
	        return current;
	    }
	public Node search(int i) {
		  Node current = first;
	        while(current.item != i)
	        {
	            if(current.next == null)
	                return null;
	            else
	                current = current.next;
	        }
	        return current;
	}
	
}
