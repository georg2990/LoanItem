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

                // hvis tallet er 0 eller negativt, viser den en fejlbesked
                if (numberOfItems <= 0) {
                    System.out.println("Indtast venligst et positivt tal.");
                }
            } else {
                // hvis input ikke er et tal, viser den en fejlbesked
                System.out.println("Det skal være et positivt tal.");
                scanner.next();
            }
        }
        scanner.nextLine();

        // array til at gemme loanitems
        loanItem[] loanItems = new loanItem[numberOfItems];

        //for loop til registrere loanitems
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Registrer Item nr. " + (i + 1));

            // Spørger om type og konverterer det til små bogstaver
            System.out.print("Type: bog/video?: ");
            String Type = scanner.nextLine().toLowerCase();

            // spørger om titel
            System.out.print("Title: ");
            String Title = scanner.nextLine();

            //opretter enten bog eller video
            if (Type.equals("bog")) {
                loanItems[i] = new Book(i + 1, Title, "Bog");
            } else if (Type.equals("video")) {
                loanItems[i] = new Video(i + 1, Title, "Video");
            }
        }
        //udskriver tabel over registrerede items
        System.out.println("\nListe af lånte items");
        System.out.println("----------------------");
        System.out.println("ID, TYPE, TITLE");

        for (int i = 0; i < loanItems.length; i++) {
                System.out.println((i + 1) + "\t" + loanItems[i]);
            }
    }
}