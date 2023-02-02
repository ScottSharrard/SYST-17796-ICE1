package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Scott Sharrard February 1, 2023
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            //Card card = new Card();
            
            int x = (int) ((Math.random() * 13) + 1);
            //System.out.println("card value is" +x);
            
            int y = (int) ((Math.random() * 4) + 1);
            //System.out.println("suit value is" +y);
            
            hand[i] = new Card(x, y);
             System.out.println(hand[i].getValue() + " " + hand[i].getSuit());
        }
        
            Scanner scanner = new Scanner(System.in);
                       
            System.out.println("Please enter a suit - string ");
            
            String s1 = scanner.next().toLowerCase();
            System.out.println("Please enter a card value 1-13 ");
               
            int s2 = scanner.nextInt();
            
            boolean correctSuit;
            boolean correctValue;
            
            for (int i = 0; i < hand.length; i++) {
            // new loop
                if (hand[i].getSuit().equals(s1)) {
                    correctSuit = true;
                } else correctSuit = false;
                 
                if (hand[i].getValue() == s2) {
                    correctValue = true;
                } else correctValue = false;
          
                
                if (correctValue && correctSuit) {
                    System.out.println("CORRECT!");
                    printInfo();
                    break;
                } else
                    System.out.println("INCORRECT!");            

        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Scott Sharrard Feb 2023
     */
    
    //Now I am really done
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Scott, you can call me Scott");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Figure out github");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Skiing");

        System.out.println();
        
    
        }

    }
