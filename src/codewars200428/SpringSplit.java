/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars200428;
import java.util.*;
/**
 *
 * @author Farzana
 */
/*

Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}

*/
public class SpringSplit {
    public static String[] solution(String s) {
        //Write your code here
        List<String> list=new ArrayList<>();        
       
         s =s.length()%2==0?s:s+"_";
         int i=0;                              

        while(i!=s.length())
            list.add(s.substring(i,i+=2));        
     
       return list.toArray(new String[list.size()]); 
    }
}
