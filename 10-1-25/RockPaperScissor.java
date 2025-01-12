import java.util.Scanner;

public class RockPaperScissor {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");
        String response = scan.nextLine();

        if (response.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();

            String compChoice = computerChoice(); 

            System.out.println("User choice "+ userChoice);
            System.out.println("Computer choice " + compChoice);

            String finalResult = result(userChoice, compChoice);
            System.out.println(finalResult);

        }
        else{
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }

    public static String computerChoice() {
        int num = (int)(Math.random()*3);
        if (num == 0){
            return "rock";
        }
        else if(num == 1 ){
            return "paper";
        }
        else{
            return "scissors";
        }
    }

    public static String result (String yourChoice , String compChoice) {

        String res;

        if ( (yourChoice.equals("rock") && compChoice.equals("scissors")) ||
        (yourChoice.equals("paper") && compChoice.equals("rock")) ||
        (yourChoice.equals("scissors") && compChoice.equals("paper")))
        {
            return "You Win";
        }
        else if ( (yourChoice.equals("scissors") && compChoice.equals("rock")) ||
        (yourChoice.equals("rock") && compChoice.equals("paper")) ||
        (yourChoice.equals("paper") && compChoice.equals("scissors")))
        {
            return "You Lose";
        }
        else if ( yourChoice.equals(compChoice))
        {
            return "Its a tie";
         
        }
        else
        {
            return "iNVALID CHOICE";
            //System.exit(0);
        }
              
    }

        
    }

