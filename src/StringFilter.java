
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class StringFilter {
    String filtering_string;
    private Object inputtedStr;
    
    StringFilter(String inputtedStr){
    this.filtering_string = inputtedStr;
    }
     
    public String filter_vowels(String inputtedStr){
    return inputtedStr.replaceAll("[aeiou]", "");
            }
    public String filter_consonants(String inputtedStr){
    return inputtedStr.replaceAll("[^aeiou]", "");
   }
}
