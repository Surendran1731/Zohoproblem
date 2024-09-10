import java.util.Scanner;
import java.util.Stack;

public class ValidPeranthesys 
{
	public static int findMaxLen(String str) {
        int n = str.length();
        
        // Create a stack
        Stack<Integer> stk = new Stack<>();
        
        // Traverse all characters of given string
        for (int i = 0; i < n; i++) {
            // If opening bracket, push index of it
            if (str.charAt(i) == '(')
                stk.push(i);
            // If closing bracket
            else {
                // If the stack is not empty and on the top
                // that is and index of an open bracket then pop
                if (!stk.isEmpty() && str.charAt(stk.peek()) == '(')
                    stk.pop();
                // If stack is empty, push current index as
                // base for next valid substring (if any)
                else
                    stk.push(i);
            }
        }

        // Initialize the result, 'last' is initialized
        // to calculate the distance
        int result = 0, last = n;

        while (!stk.isEmpty()) {
            int now = stk.pop();
            
            // take the maximum in result
            result = Math.max(result, last - now - 1);
            
            // update the last index with current index
            last = now;
        }

        // return the maximum of last and result
        return Math.max(result, last);
    }

    // Driver code
    public static void main(String[] args) {
    	Scanner  sc=new Scanner(System.in);
    	while(true)
    	{
    		System.out.println("Enter the Pernethysy");
        String str = sc.nextLine();
         
        System.out.println(findMaxLen(str));

         
        // Function call
        System.out.println(findMaxLen(str));
    	}
    }
}
