import java.util.Scanner;

/**
 * Dice Game
 * User wins:
 * 1. Sum of user number should be greater than computer number
 * 2. Difference between the sum should be less than 3
 */
public class DiceJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        
        System.out.print(" Enter three numbers between 1 and 6:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Computer Numbers");
        System.out.println(roll1 + " " + roll2 + " " + roll3);
        

        int sumNumbers = num1 + num2 + num3;
        int sumRoll = roll1 + roll2 + roll3;

        System.out.println("Your sum " + sumNumbers);
        System.out.println("Computer Sum " + sumRoll);

        if (isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)){
            System.out.println("You entered numbers out of range");
            System.exit(0);
        }

        if (userWon(sumNumbers, sumRoll)){
            System.out.println("Congratualtions! You won");
        }
        else{
            System.out.println("Better luck next time");
        }
                
        scanner.close();



    }

    public static boolean isLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers , int sumRolls ){
        return ((sumNumbers > sumRolls) && (sumNumbers - sumRolls) < 3);
    }

    public static int rollDice(){

        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
}