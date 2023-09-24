package Deneme;
import java.util.*;

class poly {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    isPalindrome(num);
  }
  
  public static void isPalindrome(int num){
    //WRITE YOUR CODE HERE


    int n = num;
    int d;
    int revNum = 0;

    while(n>0){
      d = n%10;
      n /= 10;

      revNum = revNum*10 + d;
      
    }

    if(revNum == num){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
    
  }
}