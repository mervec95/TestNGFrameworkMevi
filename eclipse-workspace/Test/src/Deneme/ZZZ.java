package Deneme;

import java.util.*;
public class ZZZ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String _time12 = scan.nextLine();
				
		String[] hoMiSe = { _time12.split(":")[0], _time12.split(":")[1], _time12.split(":")[2]}; //hour //minute //second(am/pm)
		
		String _time24 = "";
		
		if(_time12.toLowerCase().contains("am")) { //add hour
			_time24 += String.valueOf(hoMiSe[0]) + ":";
		}
		else if(hoMiSe[0].equals("12") && _time12.toLowerCase().contains("am")) {
			_time24 += "00:";
		}
		else {
			_time24 += (Integer.valueOf(hoMiSe[0]) + 12) + ":";
		}
		
		_time24 += hoMiSe[1] + ":"; //add minute
		_time24 += hoMiSe[2].toLowerCase().replace("am", "").replace("pm", ""); //add second and remove am/pm
		
		System.out.println(_time24);
	}
	
	
	
}