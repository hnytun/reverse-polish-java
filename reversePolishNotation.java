package reversePolish;

import java.util.Iterator;
import java.util.Stack;

public class reversePolishNotation {

	
	public static int calculateReversePolish(String notation){
		
		
		
		Stack<Integer> stack = new Stack<Integer>();
		
		String[] characters = notation.split(" ");
		
		
		//add the elements to a stack
		
		int currentCharIndex = 0;
		
		boolean calculating = true;
		
		while(calculating){                   
			
		if(!characters[currentCharIndex].equals("+") && !characters[currentCharIndex].equals("*"))
		{
			
			stack.add((Integer.parseInt(characters[currentCharIndex])));
			currentCharIndex++;
//			System.out.print(stack.peek());
//			System.out.print(" Added integer to stack");
//			System.out.println("");
		}
		else if(characters[currentCharIndex].equals("+")){
			stack.add((stack.pop() + stack.pop()));
			currentCharIndex++;
//			System.out.print(stack.peek());
//			System.out.print(" Added previous numbers");
//			System.out.println("");
			
		}
		else if(characters[currentCharIndex].equals("*")){
			stack.add((stack.pop() * stack.pop()));
			currentCharIndex++;
//			System.out.print(stack.peek());
//			System.out.print(" Multiplied previous numbers");
//			System.out.println("");
		}
		
		//if we have iterated over all the elements in the input array
		if(currentCharIndex == characters.length)
			return stack.peek();
		
		
		
		}
		return 0;		
	}
		
	
	public static void main(String[] args){
		//Tests
		System.out.println(calculateReversePolish("2 3 + 4 * 3 2 + 1 2 + * +"));
		
	}
	
	
}
