public class MetodoSeleccion {
    
    public void ordenar(int[] arreglo , boolean isDes) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int iM = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (isDes) {
                    if (arreglo[j] < arreglo[iM]) {
                        iM = j;
                    }
                }else{
                    if (arreglo [j] > arreglo[iM]) {
                        iM = j;

                    }
                }

            }

                if (i != iM){
                    int aux = arreglo [i];
                    arreglo [i] = arreglo [iM];
                    arreglo[iM] = aux;

                }
            
        }            
    }

    public void printArray(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }
}    



