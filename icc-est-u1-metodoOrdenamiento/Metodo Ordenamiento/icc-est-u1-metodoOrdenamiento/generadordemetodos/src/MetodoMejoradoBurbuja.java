public class MetodoMejoradoBurbuja {
    public int[] ordenarAscendente (int[] arreglo, boolean isDes, boolean mostrarPasos) {
        System.out.println();
        int tam = arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        boolean cambioRealizado = false;
        for (int i = 0; i< tam - 1; i++){
            for (int j = 0; j< tam - 1 - i; j++){
                contComparaciones++;
                if (mostrarPasos) {
                    System.out.println();
                    System.out.println("Comparacion ["+ contComparaciones +"]: " + arreglo[j] + " > " + arreglo[j+1] );
                    System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                }

                if (isDes){
                    if (arreglo[j] < arreglo[j + 1]) {
                        contCambios++;
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        cambioRealizado = true;
                    }    
                } else {
                    if (arreglo[j] > arreglo[j + 1]) {   
                        contCambios++;  
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        cambioRealizado = true;
                    }
                }
                if (mostrarPasos && cambioRealizado) {
                    System.out.print("Estado actual -> ");
                    printArray(arreglo);
                    System.out.println();
                }  
            }
            if (!cambioRealizado) {
                break;
            }
        }

        if (!cambioRealizado && mostrarPasos){
            System.out.println("(No hay intercambio)");
        }

        int[] resultados = { contComparaciones, contCambios};
        return resultados;
    }
    public void printArray (int[] arreglo) {
        for(int elemento:arreglo){
            System.out.print(elemento + "  ");
        }
    }
}
