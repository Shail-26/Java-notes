import java.util.*;

class game{
    private int userInput;
    private int randomNumber;
    boolean correctNum = false;
    private int noOfGuesses = 0;
    int limit;

    void game(){
        System.out.println("Enter the limit to guess");
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();
        Random random = new Random();
        randomNumber = random.nextInt(limit);
    }
    void takeUserInput(int n){
        Scanner st = new Scanner(System.in);
        if(n>0 && n<=limit) {
            userInput = n;
        } else {
            System.out.println("Enter the number between 0 to "+limit);
            takeUserInput(st.nextInt());
        }
    }

    void isCorrectNumber(){
        Scanner s = new Scanner(System.in);
        while(correctNum == false) {
            if(userInput == randomNumber) {
                correctNum = true;
            }
            else if (userInput < randomNumber) {
                System.out.println("Please guess the big number");
                takeUserInput(s.nextInt());
            }
            else if (userInput > randomNumber) {
                System.out.println("Please guess the small number");
                takeUserInput(s.nextInt());
            }
            noOfGuesses++;
        }

        if(correctNum == true) {
            System.out.format("You guess the correct number after %d guesses",noOfGuesses);
        }
    }

}



public class cwh_mod_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game player = new game();
        player.game();
        System.out.print("Enter a guess number : ");
        int x = sc.nextInt();

        player.takeUserInput(x);
        player.isCorrectNumber();

    }
}
