import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a": System.out.println("you chose option " + option);

            System.out.println("What is your budget?");
            double budget = scan.nextDouble();

            if(budget >= 10000){
                
                System.out.println("Great! A Nissan Altima is available");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("What is your credit score?");
                int creditScore = scan.nextInt();

                if(insurance.equals("yes") && license.equals("yes") && creditScore > 600){
                   
                    System.out.println("Sold! Pleasure doing business with you");
                }
                else{

                    System.out.println("We're sorry. You are not eligible");
                }

            }
            else{

                System.out.println("We're sorry. You are not eligible");
            }
                
                break;
            
                case "b": System.out.println("you chose option " + option);

                System.out.println("What is your car valued at?");
                int value = scan.nextInt();
                System.out.println("What is your selling price?");
                int price = scan.nextInt();

                if( value>price && price < 30000){
                    System.out.println("We will buy your car. Pleasure doing business with you!");
                }
                else{
                    System.out.println("Sorry, we're not interested.");
                }
                break;
        
            default: System.out.println("invalid option " + option);
        }
        scan.close();
        }
    }


        /******************Part 1******************/


        /******************Case A******************/

        // System.out.println("What is your budget?");

        // // budget greater than or equal to 10000
        //     System.out.println("Great! A Nissan Altima is available");
        //     System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
        //     String insurance = scan.nextLine();
        //     System.out.println("\nDo you have a license? Write 'yes' or 'no'");
        //     String license = scan.nextLine();
        //     System.out.println("What is your credit score?");
        //     int creditScore = scan.nextInt();
        //     // if they have insurace, a license, and credit score greater than 660
        //         System.out.println("Sold! Pleasure doing business with you");

        // // they don't meet budget requirements
        //         System.out.println("We're sorry. You are not eligible");

        // /******************Case B******************/
        // System.out.println("What is your car valued at?");
        // int value = scan.nextInt();
        // System.out.println("What is your selling price?");
        // int price = scan.nextInt();

        // // value is greater than price and price is less than 30000
        //     System.out.println("We will buy your car. Pleasure doing business with you!");
        // //otherwise
        //     System.out.println("Sorry, we're not interested.");

//         scan.close();
//         }
// }
