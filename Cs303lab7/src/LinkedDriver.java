
public class LinkedDriver {
	public static void main(String[] args)
    {
		
		LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);    
        list.display();
  
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.display();
 
        Node objecttosearch = list.search(50);
 
        if( objecttosearch != null)
            System.out.println("Found Node : " + objecttosearch.item);
        else
            System.out.println("Cannot locate the node");
 
        Node objecttodelete = list.delete(10);
 
        if( objecttodelete != null )
            System.out.println("Deleted node : " + objecttodelete.item);
        else
            System.out.println("Cannot delete the node");
 
 
        list.display();
        
      
    } 
    
}
