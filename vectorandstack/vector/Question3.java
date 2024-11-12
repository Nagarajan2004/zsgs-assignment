package vectorandstack.vector;

import java.util.Vector;

public class Question3 {
	public static void main(String[] args) {
		Vector<Character> characters = new Vector<Character>();
		characters.add('A');
		characters.add('B');
		characters.add('C');
		characters.add('D');
		characters.add('E');
		characters.insertElementAt('X', 2);
		characters.remove(0);
		System.out.println(characters);
	}
}
