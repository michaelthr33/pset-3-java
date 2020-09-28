import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.00");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        System.out.print("Wage: ");
        int Wage = in.nextInt();
        System.out.print("Monday: ");
        int Mon = in.nextInt();
        System.out.print("Tuesday: ");
        int Tues = in.nextInt();
        System.out.print("Wednesday ");
        int Wed = in.nextInt();
        System.out.print("Thursday ");
        int Thurs = in.nextInt();
        System.out.print("Friday ");
        int Fri = in.nextInt();
        System.out.print("Saturday ");
        int Sat = in.nextInt();
        System.out.print("Sunday ");
        int Sun = in.nextInt();
        double earnings = Wage * Mon * Tues * Wed * Thurs * Fri * Sat * Sun;
        System.out.println("$"+Decimal.format(earnings)+".");

        in.close();
    }
}