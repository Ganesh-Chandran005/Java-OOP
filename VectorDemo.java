package Ganesh;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector <Integer> rollnos = new Vector<>();
		rollnos.add(36);
		rollnos.add(14);
		System.out.println("Roll nos: " + rollnos);
		rollnos.add(1,54);
		System.out.println("Roll nos: " + rollnos);
		rollnos.get(2);
		rollnos.remove(0);
		System.out.println("Roll nos: " + rollnos);
		rollnos.removeAllElements();
		System.out.println("Roll nos: " + rollnos);

	}

}
