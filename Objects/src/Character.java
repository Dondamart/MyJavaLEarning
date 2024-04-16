/**
 *
 * @author danim
 */
public class Character {
    String name;
    String job;
    
    public static void main(String[]args){
        Character player1= new Character();
        Character player2= new Character();
        
        player1.name="Drizzt";
        player1.job="rogue";
        
        player2.name="Ulfgar";
        player2.job="barbarian";
        
        System.out.println("The name of player1 is: " + player1.name + ". He is a " + player1.job);
    }
}
