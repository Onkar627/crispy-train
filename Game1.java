package sample;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Game1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter 0 for rock,1 for paper or 2 for scissor");
        int input = sc.nextInt();
        int computerinput = rd.nextInt(3);
        if(input ==0 && computerinput==2 || input==1 && computerinput==0 || input==2 && computerinput==1){
            System.out.println("You win");
        }
        else if(input==computerinput){
            System.out.println("Match Drawn");
        }
        else{
            System.out.println("Computer wins");
        }
        if(computerinput==0) {
            System.out.println("Computer choice-rock");
        }
      else if(computerinput==1){
        System.out.println("Computer choice-paper");
    }
       else{

        System.out.println("Computer choice-scissor");
    }


    }
}