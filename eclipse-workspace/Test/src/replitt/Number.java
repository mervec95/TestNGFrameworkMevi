package replitt;

import java.util.List;
import java.util.*;

public class Number {

	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		
		for(String color:colors) {
			if(colors.equals("Green")) {
				colors.remove(colors);
			
			System.out.println(color);
		}
		}
		
		
	}

}
