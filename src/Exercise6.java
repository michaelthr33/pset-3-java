import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.##");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        System.out.print("Wage      : ");
        double Wage = in.nextDouble();
        System.out.print("Monday    : ");
        double Mon = in.nextDouble();
        System.out.print("Tuesday   : ");
        double Tues = in.nextDouble();
        System.out.print("Wednesday : ");
        double Wed = in.nextDouble();
        System.out.print("Thursday  : ");
        double Thurs = in.nextDouble();
        System.out.print("Friday    : ");
        double Fri = in.nextDouble();
        System.out.print("Saturday  : ");
        double Sat = in.nextDouble();
        System.out.print("Sunday    : ");
        double Sun = in.nextDouble();
        double earnings = Wage * Mon * Tues * Wed * Thurs * Fri * Sat * Sun;
        System.out.println("$"+Decimal.format(earnings)+".");

        in.close();
    }
}