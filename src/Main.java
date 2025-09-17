
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Loan Item!!");
        System.out.println("Hvor mange items kunne du tænke dig registrer?? ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        //spøger om tittel og type
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print("Titre: ");
            String title = scanner.nextLine();







        }












    }
}