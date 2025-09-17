
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Loan Item!!");
        System.out.println("Hvor mange items kunne du tænke dig registrer?? ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        // til at gemme input,,,,,
        String[] types = new String[numberOfItems];
        String[] titles = new String[numberOfItems];

        //spøger om tittel og type
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Bog eller video?: ");
            String Type = scanner.nextLine();

            System.out.print("Hvad er titlen: ");
            String Title = scanner.nextLine();
            }
        //udskriv tabel
        System.out.println("\nListe af lånde items");
        System.out.println("----------------------");
        System.out.println("ID, TYPE, TITLE");

        for (int i = 0; i < numberOfItems; i++) {


        }














        }












    }
