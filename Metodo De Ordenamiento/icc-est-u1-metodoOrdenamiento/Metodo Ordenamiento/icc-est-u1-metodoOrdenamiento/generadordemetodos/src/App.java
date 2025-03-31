import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("Metodos Ordenamiento");
            System.out.println("1 -> Burbuja");
            System.out.println("2 -> Seleccion");
            System.out.println("3 -> Insercion");
            System.out.println("4 -> Burbuja Mejorado");
            System.out.println("5 -> Salir");

            int metodo = getPositive(scanner, "Ingrese la opcion");
            if (metodo == 5) {
                System.out.println("Adios");
                continuar = false;
                break;
            }

            System.out.println("Desea ver los pasos? (true/false):");
            boolean conPasos = scanner.nextBoolean();
            System.out.println();

            String orden = getValidString(scanner, new String[] { "A", "B" },
                    "Desea ordenar ascendentemente presione(A) o desendentemente presione (B)?");
                    System.out.println();

            boolean ascendente = orden.equalsIgnoreCase("A");
            boolean descendente = orden.equalsIgnoreCase("B");

            int[] resultados =new int[2];

            switch (metodo) {
                case 1:
                    System.out.println("Metodo Burbuja");
                    System.out.print("Arreglo original -> ");
                    int[] list = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
                    MetodoBurbuja mB = new MetodoBurbuja();
                    mB.imprimirArreglo(list);
                    if (descendente) {
                        resultados= mB.ordenar(list, true, conPasos); 
                    } else if (ascendente) {
                        resultados= mB.ordenar(list, false, conPasos);  
                    }
                    System.out.println();
                    System.out.println("--FIN DEL METODO--");
                    System.out.print("Arreglo ordenado -> ");
                    mB.imprimirArreglo(list);
                    System.out.println("Comparaciones -> " + resultados[0]);
                    System.out.println("Cambios -> " + resultados[1]);
                    break;
                case 2:
                    System.out.println("Metodo Seleccion");
                    System.out.print("Arreglo original -> ");
                    int[] array = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
                    MetodoSeleccion mS = new MetodoSeleccion();
                    mS.printArray(array);
                    if (ascendente) {
                        resultados = mS.ordenar(array, false, conPasos);
                    } else if (descendente) {
                        resultados = mS.ordenar(array, true, conPasos);
                    }
                    System.out.println();
                    System.out.println("--FIN DEL METODO--");
                    System.out.print("Arreglo ordenado -> ");
                    mS.printArray(array);
                    System.out.println("Comparaciones -> " + resultados[0]);
                    System.out.println("Cambios -> " + resultados[1]);
                    break;
                case 3:
                    System.out.println("Metodo Insercion");
                    System.out.print("Arreglo original -> ");
                    int[] datos = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
                    metodoInsercion mI = new metodoInsercion();
                    mI.printArray(datos);
                    if (ascendente) {
                        resultados = mI.ordenarAscendente(datos, true,conPasos);
                    } else if (descendente) {
                        resultados = mI.ordenarDescendente(datos, false,conPasos);
                    }
                    System.out.println();
                    System.out.println("--FIN DEL METODO--");
                    System.out.print("Arreglo ordenado -> ");
                    mI.printArray(datos);
                    System.out.println("Comparaciones -> " + resultados[0]);
                    System.out.println("Cambios -> " + resultados[1]);
                    break;
                case 4:
                    System.out.println("Metodo Burbuja Mejorada");
                    System.out.print("Arreglo original -> ");
                    int[] listado = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};
                    MetodoMejoradoBurbuja mM = new MetodoMejoradoBurbuja();
                    mM.printArray(listado);
                    if (descendente) {
                        resultados = mM.ordenarAscendente(listado, true, conPasos);
                    }else if (ascendente) {
                        resultados= mM.ordenarAscendente(listado, false, conPasos);  
                    }
                    System.out.println();
                    System.out.println("--FIN DEL METODO--");
                    System.out.print("Arreglo ordenado -> ");
                    mM.printArray(listado);
                    System.out.println();
                    System.out.println("Comparaciones -> " + resultados[0]);
                    System.out.println("Cambios -> " + resultados[1]);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

    }

    public static int getPositive(Scanner scanner, String message) {
        int input;
        do {
            System.out.println(message + ":");
            input = scanner.nextInt();

        } while (input <= 0);
        return input;
    }

    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;
        do {
            System.out.println(message + ":");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }
            if (!valido) {
                System.out.println("Opción no válida, por favor ingrese una opción válida (" + String.join(", ", posibles) + ").");
            }
        } while (!valido);
        return input;
    }

}
