public class metodoInsercion {
   

    public void ordenarAscendente (int[] arreglo, boolean pasos){
        int tam = arreglo.length;
        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i];
            int j = i - 1;
            if (pasos){
                System.out.println("i : " + i + ", j: "  + j + ", aux: " + aux );
                System.out.println("Compara aux: "+ aux + " con arreglo ["+ i +"]: " + arreglo[0]);
                
            arreglo[j + 1] = arreglo[j];
            if (pasos)
                printArray(arreglo);

            while (j >= 0 && aux < arreglo[j]) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;
            }
        }
    }


    public void ordenarAscendente(int[] arreglo) {
        int tam = arreglo.length;
        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i];
            int j = i - 1;


            while (j >= 0 && aux < arreglo[j]) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;
        }
    }

  
    public void printArray(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}