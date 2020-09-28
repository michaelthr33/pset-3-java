import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.00");
        Decimal.setGroupingUsed(true);
        Decimal.setGroupingSize(3);
        System.out.print("Height: ");
        double height = in.nextDouble();
        System.out.print("Width: ");
        double width = in.nextDouble();
        double AreaIn = (height*2*2.54)+(width*2*2.54);
        System.out.println(AreaIn+ " centimeters");

        in.close();
    }
}