package sample;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of English");
        int marks_of_english= sc.nextInt();

        System.out.println("Enter marks of Maths");
        int marks_of_maths = sc.nextInt();
        System.out.println("Enter marks of Hindi");
        int marks_of_hindi = sc.nextInt();
        System.out.println("Enter marks of SSt");
        int marks_of_sst = sc.nextInt();
        double total_marks =  (marks_of_maths+marks_of_english+marks_of_hindi+marks_of_sst)*100;
        double total_percentage= (total_marks)/400;
        System.out.println("Total percentage obtained: "+ total_percentage);
    }
}