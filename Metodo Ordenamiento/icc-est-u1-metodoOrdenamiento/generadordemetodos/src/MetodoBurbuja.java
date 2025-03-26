public class MetodoBurbuja {

    public void ordenar(int[] arreglo, boolean isDes) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (isDes) {
                    if (arreglo[i] < arreglo[j]) {
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    } else {
                        if (arreglo[i] > arreglo[j]) {
                            int aux = arreglo[i];
                            arreglo[i] = arreglo[j];
                            arreglo[j] = aux;
                        }
                    }
                }
            }

        }
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
