public class MetodoSeleccion {
    public int[] ordenar(int[] arreglo, boolean isDes, boolean mostrarPasos) {
        System.out.println();
        int tam = arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        boolean cambioRealizado = false;
        for (int i = 0; i < tam - 1; i++) {
            int iM = i;

            for (int j = i + 1; j < tam; j++) {
                contComparaciones++;
                if (mostrarPasos) {
                System.out.println();
                System.out.println("Comparacion ["+ contComparaciones +"]: " + arreglo[j] + " > " + arreglo [iM] );
                System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo [iM]);
                }
                if (isDes) {
                    if (arreglo[j] > arreglo[iM]) {   
                        contCambios++;
                        iM = j;
                        cambioRealizado = true;
                    }
                }else{
                    if (arreglo [j] < arreglo[iM]) {   
                        contCambios++;
                        iM = j;  
                        cambioRealizado = true; 

                    }
                }

                if (mostrarPasos) {
                    System.out.print("Estado actual -> ");
                    printArray(arreglo);
                    System.out.println();
                }  
            }
                if (i != iM){
                    int aux = arreglo [i];
                    arreglo [i] = arreglo [iM];
                    arreglo[iM] = aux;

                }
            
        }  

        if (!cambioRealizado && mostrarPasos){
            System.out.println("(No hay intercambio)");
        }
        int[] resultados = { contComparaciones, contCambios};
        return resultados;          
    }

    public void printArray(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
        System.out.println();



    }
}    



