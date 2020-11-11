import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.##");

        System.out.print("Homework 1 : ");
        double hw1 = in.nextDouble();
        System.out.print("Homework 2 : ");
        double hw2 = in.nextDouble();
        System.out.print("Homework 3 : ");
        double hw3 = in.nextDouble();
        System.out.print("Quiz 1     : ");
        double quiz1 = in.nextDouble();
        System.out.print("Quiz 2     : ");
        double quiz2 = in.nextDouble();
        System.out.print("Test 1     : ");
        double test1 = in.nextDouble();
        double hw = ((hw1+hw2+hw3)/ 3)*0.15;
        double quiz = ((quiz1+quiz2)/ 2)*.35;
        double test = test1*.50;
        double average = hw+quiz+test;
        System.out.print(Decimal.format(average)+"%.");
        in.close();

    }
}