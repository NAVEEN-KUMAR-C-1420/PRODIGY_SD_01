import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        double a = sc.nextDouble();

        System.out.print("Enter the Unit (C/K/F): ");
        String s = sc.next().toUpperCase();

        if (s.equals("C")) {
            double f = (a * 9 / 5) + 32;
            double k = a + 273.15;
            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);

        } else if (s.equals("K")) {
            double c = a - 273.15;
            double f = (c * 9 / 5) + 32;
            System.out.println("Celsius: " + c);
            System.out.println("Fahrenheit: " + f);

        } else if (s.equals("F")) {
            double c = (a - 32) * 5 / 9;
            double k = c + 273.15;
            System.out.println("Celsius: " + c);
            System.out.println("Kelvin: " + k);

        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
