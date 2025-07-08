public class quintoes {
    public static void main(String[] args) {
        
        int [] a = {18, 2, 3, 4, 5};

        int minimo = a[0];

    //     for(int i =0;i<a.length;i++){
    //         if(a[i]<minimo){
    //             minimo = a[i];
    //         }
    //     }
    //     System.out.println(minimo);
    // }


            for(int i = a.length-1;i>=0;i--){
                    if(a[i]<minimo){
                        minimo = a[i];
                    }
            }
                System.out.println(minimo);
    }            
            
}


// 5) Trova il minimo
// Obiettivo: Trova il valore minimo all’interno di un array.
// Esempio: int [] a = {1, 2, 3, 4, 5}
// Output: 1
