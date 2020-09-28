import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.00");

        System.out.print("Homework 1: ");
        int hw1 = in.nextInt();
        System.out.print("Homework 2: ");
        int hw2 = in.nextInt();
        System.out.print("Homework 3 ");
        int hw3 = in.nextInt();
        System.out.print("Quiz 1: ");
        int quiz1 = in.nextInt();
        System.out.print("Quiz 2: ");
        int quiz2 = in.nextInt();
        System.out.print("Test 1: ");
        int test1 = in.nextInt();
        double hw = ((hw1+hw2+hw3)/ 3)*0.15;
        double quiz = ((quiz1+quiz2)/ 2)*.35;
        double test = test1*.50;
        double average = hw+quiz+test;
        System.out.print(Decimal.format(average)+"%");
        in.close();
    }
}