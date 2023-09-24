import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class fjgdfgf {
  
 
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int rows = inp.nextInt(), cols = inp.nextInt();
    int[][] arr = new int[rows][cols];
    for(int i=0 ;i<=arr.length;i++)
    {
      int max = arr[i][0];
      for(int j=0 ;j<arr[i].length;j++)
      {
        arr[i][j]=inp.nextInt();
      }//end for cols
    }//end for rows

                if(max<arr[i][j]){

                    max= arr[i][j];
                }
            }
            System.out.println( max);
            System.out.println();
    //TODO write your code below




    
  }
}