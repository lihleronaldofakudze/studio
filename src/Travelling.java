import java.util.Scanner;

class Travelling {

    public void calculateExpenses() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter date (23/12/2018): ");
            String date = scanner.nextLine();

            System.out.print("Enter number of kilometers travelled: ");
            int kilometers = Integer.parseInt(scanner.nextLine());

            if (kilometers > 0) {
                double totalExpenses = kilometers * 1.50;
                System.out.println("The date: " + date);
                System.out.println("The number of kilometers travelled: " + kilometers);
                System.out.println("The total expenses due: E" + totalExpenses);
            } else if (kilometers > 100) {
                double totalExpenses = kilometers * 1.50;
                System.out.println("The date: " + date);
                System.out.println("The number of kilometers travelled: " + kilometers);
                System.out.println("The total expenses due: E" + totalExpenses);
            } else {
                System.out.println("Error: kilometers cannot be zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: kilometers should be an integer value");
            e.printStackTrace();
        }
    }
}
