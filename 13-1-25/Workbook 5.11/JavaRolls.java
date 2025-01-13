import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        int diceRoll;
        int score = 0;
        diceRoll = rollDice();

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n" + //
                        "- If you roll a 6, the game stops.\n" + //
                        "- If you roll a 4, nothing happens. \n" +
                        "- Otherwise, you get 1 point.\n" + //
                        "You must collect at least 3 points to win. Enter anything to roll:");
        
        while(true){

            scan.nextLine();
            diceRoll = rollDice();
            System.out.print("You rolled a " + diceRoll);
            //
            System.out.println();

            if  (diceRoll == 6){
                System.out.print(". End of game.");
                break;
            } 
            else if( diceRoll == 4){
                System.out.println("Zero points. Keep rolling.");
                continue;
            }
            else{
                score += 1;
                System.out.print(". One point. Keep rolling.");
            }
            
        }    
        System.out.println("Your score is: " + score);  
        if( score >= 3){
            System.out.println("Wow, that's lucky. You win!");
        }          
        else{
            System.out.println("Tough luck, you lose :( ");
        }
        
        

    }
    public static int rollDice() {
        int number = (int)(Math.random() * 6 + 1);
        return number;
    }
  
  

  
  
}
