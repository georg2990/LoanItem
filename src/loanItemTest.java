import java.util.Scanner;
public class loanItemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Loan Item!!");
        System.out.println("Hvor mange items kunne du tænke dig registrer?? ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();

        // til at gemme input
       loanItem[] loanItems = new loanItem[numberOfItems];

        while (numberOfItems <=0) {
            System.out.print("Hvor mange items vil du registrer");
            if(scanner.hasNextInt()){
                numberOfItems = scanner.nextInt();
                if(numberOfItems <= 0){
                    System.out.println("venligst indtast et posetivt tal");

                }

                else{
                    System.out.println("det skal være et posetivt tal");
                    scanner.next();


        //spøger om tittel og type
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Registrer Items!!" + (i + 1));
            System.out.print("type: Bog eller video?: ");
            String Type = scanner.next().toLowerCase();
            System.out.print("Title: ");
            String Title = scanner.next();


            if (Type.equals("bog")){
                loanItems[i] = new loanItem(i,Title, Type);
            }
            else if(Type.equals("video")){
                loanItems[i] = new loanItem(i,Title, Type);

            }


                    }
                }
            }





        }
        //udskriv tabel
        System.out.println("\nListe af lånde items");
        System.out.println("----------------------");
        System.out.println("ID, TYPE, TITLE");

        for (int i =0; i<loanItems.length;i++) {
            System.out.println((i + 1) +"\t" + loanItems[i].title + "   " + loanItems[i].type + "  ".toString());
        }




            }



        }









