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
        
        //Return position of a letter
        String word= "España";
        int whatIndex= word.indexOf("ñ");
        System.out.println("The position of the letter 'ñ' is: "+whatIndex);
        
        //extract a char from index using charAt    
        char extractLetter= "España".charAt(4);
        System.out.println("In the position '4' the letter is: "+ extractLetter);
        
        //Check if a string contains a specific value    
        String messaj= "How are you doing?";
        
        boolean hasWord= messaj.contains("you");
        System.out.println(messaj+ "  Contains the word 'you'? : " + hasWord);
        
        //Check if a string starts/ends with a specific value    
        String favourite= "My favourite language is Java";
        
        Boolean checking=favourite.startsWith("My");
        Boolean checking2=favourite.endsWith("Python");
        
        System.out.println("The sentence: '" +favourite+"' "+ "starts with 'My' and ends with 'Python'?: " + checking + " " + checking2);
        
        //The string is empty?    
        System.out.println("Is this string  empty?  " + "".isEmpty());
        
        //Replace a text    
        String stringToReplace= "  Dritzz Do´Urden is an elf  ";
        String stringReplaced= stringToReplace.replace("elf", "drow");
        
        System.out.println(stringReplaced);
        
        //Remove blancs
        String trimmed= stringReplaced.strip();
        System.out.println(trimmed);
        
        //To Upper Case/ Lower Case
        
       System.out.println(favourite.toLowerCase()+ " " + favourite.toUpperCase());
       
       
    }
    
}
