import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.00");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);

        System.out.print("Salary  : ");
        double Salary = in.nextDouble();
        System.out.print("410(k)  : ");
        double savings = in.nextDouble();
        System.out.print("Federal : ");
        double federal = in.nextDouble();
        System.out.print("State   : ");
        double state = in.nextDouble();
        double SavingsPercent =savings/100;
        double FederalPercent = federal/100;
        double StatePercent = state/100;
        double StartingPaycheck = Salary/2;
        double Paycheck = StartingPaycheck*SavingsPercent*FederalPercent*StatePercent;
        System.out.println("$"+Decimal.format(Paycheck)+".");

        in.close();
    }
}