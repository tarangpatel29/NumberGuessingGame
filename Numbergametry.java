import java.util.Scanner;
import java.util.Random;

public class Numbergametry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int randnum = rand.nextInt(100);
        int attemptnum = 0;
        int score;
        
        System.out.print("Enter a number{1-100}: ");
        int num = sc.nextInt();
        System.out.println(randnum);
        
        for(int i=5;i>=1;i--)
        {
            if(num == randnum)
        {
            System.out.println("You Won, You Guessed the correct number!");
            attemptnum = i;
            if(attemptnum == 5){
            score = 10;
            System.out.println("Score: "+score);
        }
        else if(attemptnum == 4){
            score = 8;
            System.out.println("Score: "+score);
        }
        else if(attemptnum == 3){
            score = 6;
            System.out.println("Score: "+score);
        }
        else if(attemptnum == 2){
            score = 4;
            System.out.println("Score: "+score);
        }
        else if(attemptnum == 1){
            score = 2;
            System.out.println("Score: "+score);
        }
            return;
        }
            else if(num > randnum)
        {
            System.out.println("You are too high! \nTry Again");
            System.out.println((i-1)+" tries are remaining!");
            num = sc.nextInt();
        }
            else if(num < randnum)
        {
            System.out.println("You are too low! \nTry Again");
            System.out.println((i-1)+" tries are remaining!");
            num = sc.nextInt();
        }
            else{
                System.out.println("You Lost!");
            }
        
        }
        
    }
    
}
