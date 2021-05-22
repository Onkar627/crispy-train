package sample;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;
class Game{
    int number;
    int userinput;
    int noofguesses=0;
    Game(){
        Random rd = new Random();
        this.number = rd.nextInt(100);

    }
    public void takeuserinput(){
        System.out.println("Enter your input");
        Scanner sc= new Scanner(System.in);
        userinput=sc.nextInt();
    }
    boolean isCorrectNumber(){
        noofguesses++;
        if(number==userinput){
            System.out.printf("You guessed it in %d attempts\n",noofguesses);
            System.out.println("You guessed the number correct!!!!!");
            return true;
        }
        else if(number<userinput){
            System.out.println(" Entered number is Higher");
        }
        else if(number>userinput){
            System.out.println("Entered number is Lower");
        }

        return false;
    }


}

public class Game2 {
    public static void main(String[] args) {
Game g = new Game();
g.takeuserinput();
boolean b = g.isCorrectNumber();
while(b!=true){
    g.takeuserinput();
    b=g.isCorrectNumber();


}



    }

}