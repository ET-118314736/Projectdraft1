/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StringFilterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String inputtedStr = scan.next();
        StringFilter strFilter = new StringFilter(inputtedStr);
        System.out.println(strFilter.filter_vowels(inputtedStr));
        System.out.println(strFilter.filter_consonants(inputtedStr));
        
    }
    
}
