public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] numbers = new int[10];

        for( int i=0 ; i < 10 ; i++){
            numbers[i] = randomNumber();

        }
        System.out.print("Here are the scores: ");
        for ( int i=0 ; i < 10 ; i++){
        System.out.print(numbers[i] + " ");
        if(numbers[i] > highScore){
            highScore = numbers[i];
        }
        }
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).


        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }   
    public static int randomNumber() {
        int number = (int)(Math.random() * 49999) ;
        return number;
        
    } 

}
