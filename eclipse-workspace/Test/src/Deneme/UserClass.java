package Deneme;

  public class UserClass {
	
	String name;
	long number;
	{
	name = "Merve";
	number = 123456789l;
	}
  class userInfo extends UserClass{
		
		String address;
		
		{
			address = "5085 NW";
		}
		
	}
	public void display() {
	
		String address = "5085 NW";
		System.out.println("My name is: " + name + " My phone number is: " + number + " My address is: " + address);
	}
	
	public static class Demo{
		public static void main(String[] args) {
			UserClass uc = new UserClass();
			uc.display();
		}
	}
	
	
	

}
