import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class BalancedParanthesis {
	 private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
	    static {
	        brackets.put('[', ']');
	        brackets.put('{', '}');
	        brackets.put('(', ')');
	    }  

	    private BalancedParanthesis() {};

	    /**
	     * Returns true is parenthesis match open and close.
	     * Understands [], {}, () as the bracket
	     * @param str   the input brackets
	     * @return      true if paranthesis match.
	     */
	    public static boolean isBalanced(String str) {
	        if (str.length() == 0) {
	            throw new IllegalArgumentException("String length should be greater than 0");
	        }
	        // odd number would always result in false
	        if ((str.length() % 2) != 0) {
	            return false;
	        }

	        final Stack<Character> stack = new Stack<Character>();
	        for (int i = 0; i < str.length(); i++) {
	            if (brackets.containsKey(str.charAt(i))) {
	                stack.push(str.charAt(i));
	            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
	                return false;
	            } 
	        }
	        return true;
	    } 

	    public static void main(String[] args) {
	    	assertTrue(isBalanced("{}([])"));
	        assertFalse(isBalanced("([}])"));
	        assertTrue(isBalanced("([])"));
	        assertTrue(isBalanced("()[]{}[][]"));
	    }

		private static void assertFalse(boolean balanced) {
			// TODO Auto-generated method stub
			
		}

		private static void assertTrue(boolean balanced) {
			// TODO Auto-generated method stub
			
		}

}
