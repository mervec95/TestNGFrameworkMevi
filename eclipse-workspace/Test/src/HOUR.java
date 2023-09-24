import java.util.*;

public class HOUR {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		String time12 = scan.nextLine();
		
		String[] HourMinuteSecond = {time12.split(":")[0], time12.split(":")[1], time12.split(":")[2]};
		
		String time24 = "";
		
		if(time12.toLowerCase().contains("am")) {
			time24 += String.valueOf(HourMinuteSecond[0]) + ":";
		}
		else if(HourMinuteSecond[0].equals("12")&& time12.toLowerCase().contains("am")) {
			time24 += ":";
		}
		else {
			time24 += "00:";
		}
		time24 += HourMinuteSecond[1] + ":"; 
		time24 += HourMinuteSecond[2].toLowerCase().replace("am", "").replace("pm", "");
		
		System.out.println(time24);
	}

}
