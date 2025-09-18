import java.util.Scanner;
public class loanItemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Loan Items!");
        System.out.println("Hvor mange items kunne du tænke dig at registrere? ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        // til at gemme input
        loanItem[] loanItems = new loanItem[numberOfItems];

        //spøger om tittel og type
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Registrer Item nr. " + (i + 1));
            System.out.print("Type: bog/video?: ");
            String Type = scanner.next().toLowerCase();

            System.out.print("Title: ");
            String Title = scanner.next();

            if (Type.equals("bog")) {
                loanItems[i] = new Book(i + 1, Title, "Bog");
            } else if (Type.equals("video")) {
                loanItems[i] = new Video(i + 1, Title, "Video");
            } else {
                System.out.println("Vi har ikke denne type. Item springes over.");
            }
        }
        //udskriv tabel
        System.out.println("\nListe af lånte items");
        System.out.println("----------------------");
        System.out.println("ID, TYPE, TITLE");

        for (int i = 0; i < loanItems.length; i++) {
                System.out.println((i + 1) + "\t" + loanItems[i].title + "   " + loanItems[i].type + "  ".toString());
            }
        }}