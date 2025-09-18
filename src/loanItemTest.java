import java.util.Scanner;
public class loanItemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Velkomst besked
        System.out.println("Velkommen til Loan Items!");

        int numberOfItems = 0;

        // while-loop til at sikre positivt heltal
        while (numberOfItems <= 0) {
            System.out.print("Hvor mange items vil du registrere? ");

            // tjekker om input er et heltal
            if (scanner.hasNextInt()) {
                numberOfItems = scanner.nextInt();

                // hvis tallet er 0 eller negativt
                if (numberOfItems <= 0) {
                    System.out.println("indtast venligst et positivt tal.");
                }
            } else {
                // hvis input ikke er et tal
                System.out.println("det skal være et positivt tal.");
                scanner.next();
            }
        }
        scanner.nextLine();

        // array til at gemme input
        loanItem[] loanItems = new loanItem[numberOfItems];

        //spøger om titel og type
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Registrer Item nr. " + (i + 1));
            System.out.print("Type: bog/video?: ");
            String Type = scanner.nextLine().toLowerCase();

            System.out.print("Title: ");
            String Title = scanner.nextLine();

            if (Type.equals("bog")) {
                loanItems[i] = new Book(i + 1, Title, "Bog");
            } else if (Type.equals("video")) {
                loanItems[i] = new Video(i + 1, Title, "Video");
            }
        }
        //udskriv tabel
        System.out.println("\nListe af lånte items");
        System.out.println("----------------------");
        System.out.println("ID, TYPE, TITLE");

        for (int i = 0; i < loanItems.length; i++) {
                System.out.println((i + 1) + "\t" + loanItems[i]);
            }
    }
}