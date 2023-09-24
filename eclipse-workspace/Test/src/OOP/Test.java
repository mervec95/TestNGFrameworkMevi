package OOP;

class data{
	private String name;
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Test {

	public static void main(String[] args) {
		
data obj = new data();
obj.setName("Neotech");
System.out.println(obj.getname());
	}

}
