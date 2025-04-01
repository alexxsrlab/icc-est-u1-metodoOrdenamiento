public class MetodoBurbuja {

    public int[] ordenar(int[] arreglo, boolean isDes, boolean mostrarPasos) {
        int tam = arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        boolean cambioRealizado = false;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1 - i; j++) {  
                contComparaciones++;  
                
                if (mostrarPasos) {
                    System.out.println();
                    System.out.println("Comparacion ["+ contComparaciones +"]: " + arreglo[j] + " > " + arreglo[j+1] );
                    System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                }

                if (isDes) {
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
                    imprimirArreglo(arreglo);
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

        int[] resultados1 = { contComparaciones, contCambios };
        return resultados1;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
