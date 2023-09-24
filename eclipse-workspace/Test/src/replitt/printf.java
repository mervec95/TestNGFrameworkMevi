package replitt;

import java.util.*;
class printf {
  public static void main(String[] args) {
    //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
    // Variables are already declared and given
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    
    //2nd way
    String a2 = null;
    String b2 = null;
    
    //WRITE YOUR CODE HERE:

if(a>b){
   System.out.printf("%d is greater", a);
    }
    else {
      System.out.printf("%d is greater", b);
    }
    


//2nd way

if(a > b) {
    System.out.println(new String(a2).concat(" is greater"));
  }
  else {
    System.out.println(new String(b2).concat(" is greater"));
  }

//3rd way
System.out.println(new String("Merve").concat(" Cuvan").concat("lioglu"));

  }
}