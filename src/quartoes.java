public class quartoes {
    public static void main(String[] args) {
        
        int [] a = {1, 2, 3, 4, 5};

        int massimo = a[0];
        for (int i = 0;i<a.length;i++){
            if(a[i]>massimo){
                massimo = a[i];

            }
        }
        System.out.println(massimo);
    }
    
}


// 4) Trova il massimo
// Obiettivo: Trova il valore massimo all'interno di un array di interi.
// Esempio: int [] a = {1, 2, 3, 4, 5}
// Output: 5