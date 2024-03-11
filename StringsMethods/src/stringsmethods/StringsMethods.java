/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsmethods;

/**
 *
 * @author danim
 */
public class StringsMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Length of a string
        int lenghtOfString= "Hi, I´m Dani".length();
        
        System.out.println("The length of your sentence is: "+ lenghtOfString);
        
        //Extract part of a string
        
        String letsQuoteIt= "I want to quote part of this sentence";
        String quote= letsQuoteIt.substring(15, 28);
        
        System.out.println("The quote is: " + quote);
        
        //Compare strings
        
        String str1="first string";
        String str2="second string";
        Boolean comparisson= str1.equals(str2);
        System.out.println("Are these strings the same? " + comparisson);
        
        
        //Compare ignoring capital or lowcase
        
        String str3="This string";
        String str4="this String";
        Boolean comparisson2= str3.equalsIgnoreCase(str4);
        System.out.println("Are these strings the same? " + comparisson2);
        
    }
    
}
