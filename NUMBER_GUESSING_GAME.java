import java.util.Random;
import java.util.Scanner;
public class NUMBER_GUESSING_GAME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        boolean b=false;
        int turn;
        int number=rand.nextInt(1,100);
        System.out.println("I have guessed a number");
        System.out.println("now lets begin the guessing game,Good Luck!!!");
        System.out.println("How many attempts do you want?");
        int attempt=sc.nextInt();
        int copy=attempt;
        int score=100;
        for (turn=1;turn<=attempt;turn++,copy--){
            System.out.println("Your choice: ");
            int guess=sc.nextInt();
            if (guess<number){
                System.out.println("Your choice is smaller than the actual number");
                System.out.printf("Remaining attempts:%d \n",copy-1);
            }
            else if (guess>number) {
                System.out.println("Your choice is bigger than the actual number");
                System.out.printf("Remaining attempts:%d \n",copy-1);
            }
            else{
                System.out.printf("YOU WIN!!!, %d's the number\n",guess);
                b=true;
                break;
            }
        }
        if (b){
            System.out.printf("you win in %d turns\n",turn);
            System.out.printf("Your score is %d out of 100",score-((turn-1)*10));
        }
        else {
            System.out.println("SORRY, YOU LOST!");
        }
    }
}
