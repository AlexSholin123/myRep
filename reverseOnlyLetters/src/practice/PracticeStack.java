package practice;

import java.util.Stack;

public class PracticeStack {

	public static void main(String[] args) {
		Stack<String> games = new Stack<String>();
		
		games.push("Half-Life 1");
		games.push("Half-Life 2");
		games.push("Cyberpunk 2077");
		
		System.out.println(games);
		
		System.out.println(games.peek());
		
		System.out.println(games);
		
	System.out.println(games.pop());
	System.out.println(games);
	System.out.println(games.pop());
	System.out.println(games);
	System.out.println(games.pop());
	
	System.out.println(games);
	
	Stack<Character> tower = new Stack<Character>();
	
	tower.push('a');
	tower.push('b');	
	tower.push('s');
	
	System.out.println(tower.set(1, 'i'));
	
	System.out.println(tower);
	
	System.out.println(tower.size());
	
	
}}
