/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars200428;

/**
 *
 * @author Besty
 */
/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
*/
public class BinaryBitCounting {
    public static int countBits(int n){
		// Show me the code!
        int count=0,p=0,r=0;
        while(n>=1){
           p=n/2;
           r=n%2;
           if(r==1) count++;
           n=p;

           System.out.print(" "+r+" n="+n);
        }

        return count;
    }
}
