package practice;

import java.util.Stack;

public class ReversedLetters {

	public static void main(String[] args) {
		
		String word = reverseOnlyLetters("qwer5ty");
		
		System.out.println(word);
	}
	
	
	    public static String reverseOnlyLetters(String word) {
	    	
	        Stack<Character> letters = new Stack<Character>();
	        
	        for (char character : word.toCharArray()) {
	            
	        	if (Character.isLetter(character)) {
	                letters.push(character);
	            }
	        }

	        StringBuilder answer = new StringBuilder();
	        
	        for (char character : word.toCharArray()) {
	        	
	            if (Character.isLetter(character)) {
	                answer.append(letters.pop());
	            }
	            
	            else {
	                answer.append(character);
	            }
	        }

	        return answer.toString();
	    }
	}




/***
 * word = qwer5ty
 * 
 * word.toCharArray() ---> {'q','w','e','r','5','t','y'}
 * 
 * y-
 * t-
 * r-
 * e-
 * w-
 * q-
 * 
 * letters.push(c) ---->  [q,w,e,r,t,y]
 * 
 * S.toCharArray() ---> {'q','w','e','r','5','t','y'}
 * 
 * _+y+t+r+e+5+w+q
 * 
 * ytre5wq
 * 
 *****/
