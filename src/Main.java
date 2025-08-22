import java.util.Arrays;

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

        int [] numbers = {50,3,89,44,26,87,2,33,76,40};
        System.out.println("Array before:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        Arrays.sort(numbers);

        System.out.println("Array after:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int summe = 0;

        for (int number : numbers) {
            summe += number;
        }
        double durchschnitt = (double) summe / numbers.length;
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Durchschnitt: " + durchschnitt);



    } }