public class metodoInsercion {

    public int[] ordenar(int[] arreglo, boolean ascendente, boolean mostrarPasos) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        boolean cambioRealizado = false;

        for (int i = 1; i < tam; ++i) {
            int aux = arreglo[i];
            int j = i - 1;
            contComparaciones++; 

            if (mostrarPasos) {
                System.out.println();
                System.out.println("Comparacion [" + contComparaciones + "]: " + arreglo[j] + " > " + arreglo[j + 1]);
                System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
            }

            if (ascendente) {
                while (j >= 0 && aux < arreglo[j]) {
                    contCambios++; 
                    arreglo[j + 1] = arreglo[j];
                    j = j - 1;
                    cambioRealizado = true;
                }
            }

            else {
                while (j >= 0 && aux > arreglo[j]) { 
                    contCambios++;  
                    arreglo[j + 1] = arreglo[j];
                    j = j - 1;
                    cambioRealizado = true;
                }
            }

            arreglo[j + 1] = aux;

            if (mostrarPasos && cambioRealizado) {
                System.out.print("Estado actual -> ");
                printArray(arreglo);
                System.out.println();
            }
        }

        if (!cambioRealizado && mostrarPasos) {
            System.out.println("(No hay intercambio)");
        }

        int[] resultados1 = { contComparaciones, contCambios };
        return resultados1;
    }
    
    public void printArray(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}

    
    
    
    

   


  
