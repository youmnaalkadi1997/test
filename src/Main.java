import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // int number = 9;

        // String parity = (number % 2 == 0) ? "Gerade" : "Ungerade";
        //System.out.println("Die Zahl " + number + " ist " + parity + ".");

        //  Scanner scanner = new Scanner(System.in);
        //  String name = scanner.nextLine();
        //  String result = (name.trim().isEmpty()) ? "Ungültiger Name" : "Hallo, " + name;
        //  System.out.println(result);
        // scanner.close();

        System.out.println("Add: " + add(5, 3));
        System.out.println("Subtract: " + subtract(10, 4));
        System.out.println("Multiply: " + multiply(6, 7));
        System.out.println("Divide: " + divide(10, 2));
        System.out.println("Divide durch 0: " + divide(10, 0));

    }

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Fehler: Division durch 0 ist nicht erlaubt!");
                return Double.NaN;
            }
            return a / b;
        }
}