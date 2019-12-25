import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        System.out.println("Menu of Temperature convert: ");
        System.out.println("1.Fahrenheit to Celsius.");
        System.out.println("2.Celsius to Fahrenheit.");
        System.out.print("Enter your choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice != 1 && choice != 2) {
            System.out.println("Invalid Choice!!!");
        } else {
            System.out.print("Enter Temperature value to convert: ");
            double input = sc.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println(input + " Fahrenheit = " + ctoF(input) + "Celsius.");
                    break;
                case 2:
                    System.out.println(input + "Celsius = " + fToC(input) + "Fahrenheit.");
                    break;
            }
        }
    }

    private static double ctoF(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    private static double fToC(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }


}