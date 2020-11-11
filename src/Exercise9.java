import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount : ");
        double Amount = in.nextDouble();
        double Money = Amount * 100;
        double Quarter = Money/25;
        double QuarterChange = Money%25;
        double Dime = QuarterChange / 10;
        double DimeChange = QuarterChange%10;
        double Nickle = DimeChange/5;
        double Penny = DimeChange%5;


                System.out.println("Quarters : "+Quarter);
                System.out.println("Dimes    : "+Dime);
                System.out.println("Nickles  : "+Nickle);
                System.out.println("Pennies  : "+Penny);

        in.close();
    }
}