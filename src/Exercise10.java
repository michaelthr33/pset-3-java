import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit:");
        int Fahrenheit = in.nextInt();
        double Celsius = ((Fahrenheit-32)*5)/9;
        double Kelvin = Celsius+273;
        System.out.println("Celsius: "+Celsius);
        System.out.println("Kelvin: "+Kelvin);

        in.close();
    }
}