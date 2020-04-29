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
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
*/
public class SumOfOddNumberTraingle {
     public static int rowSumOddNumbers(int n) {
      return (int)Math.pow(n,3);
      // or return n*n*n;
    }
}
