import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat Decimal = new DecimalFormat("#.##");

        System.out.print("Fahrenheit : ");
        double Fahrenheit = in.nextDouble();
        double Celsius = ((Fahrenheit-32)*5)/9;
        double Kelvin = Celsius+273;
        System.out.println("Celsius : "+Decimal.format((Celsius)));
        System.out.println("Kelvin  : "+Decimal.format(Kelvin));

        in.close();
    }
}