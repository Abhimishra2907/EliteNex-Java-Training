import java.util.Scanner;

class ATMPINChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int atmPin = 1234;
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts != maxAttempts) {

            System.out.print("Please enter ATM PIN: " );
            int userPin = sc.nextInt();

            if (userPin == atmPin) {
                System.out.println("You have successfully logged in.");
				System.out.println(" Welcome to ATM Services ");
				System.out.println(" Your Card Is Accepted");
                return;
            } else {
                attempts++;
				System.out.println(attempts + " attempt(s) used.");
                System.out.println("Invalid ATM PIN.");
				System.out.println("Remaining attempts: " + (maxAttempts - attempts));
				System.out.println(" \n");
            }
        }

        System.out.println("Your ATM card is blocked.");
		sc.close();
    }
}