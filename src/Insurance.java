import java.util.Scanner;

public class Insurance {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("\n\n");

        System.out.print("Enter current: ");
        int currentYear = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter date of birth Year: ");
        int dobYear = Integer.parseInt(scanner.nextLine());

        System.out.print(
                "Your premium amount to : E " + calculatePremium(currentYear, dobYear));

        System.out.println("\n\n");
    }

    public static int calculatePremium(int currentYear, int dobYear) {
        int age = currentYear - dobYear;
        if (age >= 100) {
            return 0;
        }
        int premium = 0;
        int decade = dobYear / 10;
        premium = age * decade + 15;
        return premium;
    }
}
