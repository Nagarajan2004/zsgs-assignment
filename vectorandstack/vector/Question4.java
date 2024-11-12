package vectorandstack.vector;

import java.util.Vector;

public class Question4 {
	public static void main(String[] args) {
		Vector<Double> vector = new Vector<Double>();
		for(int i = 0; i < 5; i++) {
			vector.add(((int)((Math.random()*20)*10)/10.0));
		}
		if(vector.contains(10.5)) {
			System.out.println("10.5 is contain in vector");
		} else {
			System.out.println("10.5 is not contain in vector");
		}
		System.out.println("size of the vector before : "+vector.size());
		for(int i = 0; i < 5; i++) {
			vector.add(((int)((Math.random()*20)*10)/10.0));
		}
		System.out.println("size of the vector after : "+vector.size());
	}
}
