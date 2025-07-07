
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // 1) Tabellina


       Scanner scan = new Scanner(System.in);

       System.out.println("digita un numero per la tabellina");

       int numeroTabellina = scan.nextInt();
         
       System.out.println("digita un numero per indicare la fine della tabellina");
       int numeroFineTabellina = scan.nextInt();

        for ( int i =0; i <= numeroFineTabellina ;i++){
            System.out.print(numeroTabellina * i);
            if (i<numeroFineTabellina){
                System.out.print(",");
            }
        }


    
    }
}
// 1) Tabellina
// Obiettivo: Chiedere all'utente di quale numero stampare la tabellina e fino a quale numero arrivare.
// Esempio: numeroTabellina 5, numeroFineTabellina 10
// Output: 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50