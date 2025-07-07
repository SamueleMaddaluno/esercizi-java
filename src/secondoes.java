import java.util.Scanner;

public class secondoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("srivi il numero per calcolarne il fattoriale");
        int numero = scan.nextInt();
        int prodotto = 1;
        String fattori = "";
        for (int i = numero;i>=1;i--){
            prodotto *= i;
            fattori += i;
            if (i>1){
                fattori+="x";
            }
        }
        System.out.print(fattori+" = "+prodotto);
    }
}



// 2) Fattoriale di un numero
// Obiettivo: Chiedere all'utente un numero n e calcola il suo fattoriale.
// Esempio: n = 5
// Output: 5x4x3x2x1 = 120