package replitt;

import java.util.Scanner;
import java.util.*;

public class split {

	public static void main(String[] args) {
		

		Set<String> setA = new HashSet<>();
		
		setA.add("Apple");
		setA.add("Banana");
		setA.add("Orange");
		
Set<String> setB = new HashSet<>();
		
		setA.add("Banana");
		setA.add("Grapes");
		setA.add("Orange");
		
		Set<String> resultSet = new HashSet<>(setA);
		
		resultSet.removeAll(setB);
		{
		System.out.println(setA);
		
		}
		
	}
}