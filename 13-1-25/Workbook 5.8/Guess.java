import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int secret = 4;
       int num = scan.nextInt();
       while ( num != secret){
        System.out.print("Guess again: ");
        num = scan.nextInt();
       }

       System.out.println("You got it!");       
       //See Learn the Part for detailed instructions.
        
        scan.close();
    }

}
