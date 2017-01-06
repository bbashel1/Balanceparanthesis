import java.util.Stack;


public class stackDriver {
	public static void main(String[] args) {
		System.out.println("Start Stack\n-----------\n");
		Stack example = new Stack();
		example.DisplayStack();
		
		String one = new String("one");
		System.out.print("Push: ");
		if (example.Push(one))
			System.out.println(one);
		else
			System.out.println("Insert Failed");
		example.DisplayStack();
		
		String two = new String("two");
		System.out.print("Push: ");
		if (example.Push(two))
			System.out.println(two);
		else
			System.out.println("Insert Failed");
		example.DisplayStack();
		
		Object result;
		
		System.out.print("Pop: ");
		result = example.Pop();	
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.DisplayStack();
		
		System.out.print("Pop: ");
		result = example.Pop();	
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.DisplayStack();
		
		System.out.print("Pop: ");
		result = example.Pop();	
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.DisplayStack();
	}
}
