import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#");
        System.out.print("Students : ");
        double Students = in.nextDouble();
        System.out.print("Teachers : ");
        double Teachers = in.nextDouble();
        System.out.print("Capacity : ");
        double Capacity = in.nextDouble();
        double Passengers = Students + Teachers;
        double Bus = Passengers / Capacity;
        double Overflow = Passengers % Capacity;
        System.out.println("Buses required      : "+Decimal.format(Bus));
        System.out.println("Overflow passengers : " + Overflow);
    }
}