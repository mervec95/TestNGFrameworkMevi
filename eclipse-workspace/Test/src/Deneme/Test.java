package Deneme;

class data{
	private static String name;
	
	public static String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class Test extends data {

	public static void main(String[] args) {
		data obj = new data();
		obj.setName("NeoTech");
		System.out.println(obj.getName());
	}

}
