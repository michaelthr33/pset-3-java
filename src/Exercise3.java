import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    DecimalFormat Decimal = new DecimalFormat("#.00");
    Decimal.setGroupingUsed(true);
    Decimal.setGroupingSize(3);

    System.out.print("Height: ");
    double height = in.nextDouble();
    System.out.print("Width: ");
    double width = in.nextDouble();
    double area = (height * 25.4) * (width * 25.4);

    System.out.println (Decimal.format(area) + " square millimeters");

     in.close();
    }
}
