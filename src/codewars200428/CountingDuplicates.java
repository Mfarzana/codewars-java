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
    /* Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice

*/
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Write your code here
    char[] a=text.toLowerCase().toCharArray();
    int count=0;

    for(int i=0;i<a.length;i++){
       int max=1;
      for(int j=i+1;j<a.length;j++){   

        if(a[i]==a[j] && a[i]!=' '){   
          max+=1;   
          a[j]=' ';             
        }         
      }                 

      if(max>1) count++;  

    }    
    return count;
    
  }
}
/*
Time: 2877ms Passed: 9 Failed: 0
Test Results:
 SolutionTest
 abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix
 emptyReturnsZero
 IndivisibilitiesReturnsTwo
 abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix
 abcdeaBReturnsTwo
 abcdeaaReturnsOne
 abcdefghijklmnopqrstuvwxyzaaAbReturnsTwo
 abcdefghijklmnopqrstuvwxyzReturnsZero
 abcdeReturnsZero
Completed in 15ms
You have passed all of the tests! :)
*/