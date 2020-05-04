/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars200428;

/**
 *
 You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
* 
* 
 */
public class FindOutlier{
    public int find(int[] integers){
        int count1=0,count2=0;
        int num1=0,num2=0;
        for(int i=0;i<integers.length;i++){
            if(integers[i]%2==0){
                count1++;
                num1=integers[i];
            }
            if(integers[i]%2!=0){
                count2++;
                num2=integers[i];
            }
        }

      return count1==1?num1:num2;
  }
}