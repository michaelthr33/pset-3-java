import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("0");
        System.out.print("Students: ");
        int Students = in.nextInt();
        System.out.print("Teachers: ");
        int Teachers = in.nextInt();
        System.out.print("Capacity: ");
        int Capacity = in.nextInt();
        double Passengers = Students + Teachers;
        double Bus = Passengers / Capacity;
        double Overflow = Passengers % Capacity;
        System.out.println("Buses required: "+Decimal.format(Bus));
        System.out.println("Overflow passengers: " + Overflow);
    }
}