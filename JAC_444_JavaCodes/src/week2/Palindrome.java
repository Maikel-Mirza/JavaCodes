// Palindrome.java

public class Palindrome {
	
	// Check if the stack is palindrome
	private static boolean isPalindrome(String input) {

		// Create a Stack to hold the input
		Stack stack = new Stack(input.length());
			
		// For loop to populate the stack
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
			
		// Compare input with pop, this way we don't need to reverse the array
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true;
	}
	
	// Create main
	public static void main(String[] args) {
		
		// Create a string from argument
		String input = args[0];
		
		if (isPalindrome(input)) {
			System.out.println("The string " + input + " is a palindrome.");
		} else {
			System.out.println("The string " + input + " is NOT a palindrome.");
		}
	}
}










/////////////
// Stack.java

public class Stack {

	// Create an array to hold the stack
	private char[] stack;
	private int top;
	
	// Constructor
	public Stack(int size) {
		stack = new char[size];
		top = -1;
	}
	
	// Create a method that add data into stack
	public void push(char data) {
		stack[++top] = data;
	}

	// Create a method that remove data from stack
	public char pop() {
		return stack[top--];
	}
	
}