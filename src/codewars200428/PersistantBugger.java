/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineproblemsloving_20_4_28;

/**
 *
 * @author Besty
 */
/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
                      // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
                       // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number

*/
public class PersistantBugger {
     public static int persistence(long n) {
		// your code
       /*   System.out.print(" n=  "+n);

      if(n/10==0) return 0;
      
      n=(n/10)*(n%10);
      
      return persistence(n)+1;       
       
      */
      int count=0;    
      while(n>9){
          long m=1;
          for(char c:String.valueOf(n).toCharArray()){
              m*=Long.parseLong(String.valueOf(c));
          }
         n=m;
         count++;        
      }
      return count;
    
    }
}
