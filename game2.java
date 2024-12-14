import java.util.Random;
import java.util.Scanner;

class Gamee1{
    public int number;
    public int UserInput;
    public int numofGuesses=0;

    public int getNumOfGuesses(){
        return numofGuesses;
    }

    public void setNumOfGuesses(int numofGuesses){
        this.numofGuesses=numofGuesses;
    }
     Gamee1(){
        Random rand = new Random();
        this.number =rand.nextInt(100);
    }
    
     void takeUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Guess The Number:");
        UserInput = in.nextInt();
        
       in.close();
    }
    boolean isCorrectNum(){
        numofGuesses++;
        if(UserInput==number)
        {
            System.out.format("Yess!!! You guessed it right...The number was %d\n And the number of guesses are :%d",number,numofGuesses);
            return true;  
        }
        else if(UserInput>number){
            System.out.println("Too high...");
        }
        else if(UserInput<number){
            System.out.println("low...");
        }
        return false;
      
    }
}




public class game2 {
    public static void main(String[] args) {
        Gamee1 g = new Gamee1();
        boolean b = false;
        while(!b){
        g.takeUserInput();
         b= g.isCorrectNum();
         
        }
    }
}
